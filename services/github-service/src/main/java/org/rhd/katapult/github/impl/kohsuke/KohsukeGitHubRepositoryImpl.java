package org.rhd.katapult.github.impl.kohsuke;

import org.kohsuke.github.GHRepository;
import org.rhd.katapult.github.api.GitHubRepository;

/**
 * Kohsuke implementation of a {@link GitHubRepository}
 *
 * @author <a href="mailto:alr@redhat.com">Andrew Lee Rubinger</a>
 */
class KohsukeGitHubRepositoryImpl implements GitHubRepository {

    private final GHRepository delegate;

    /**
     * Creates a new instance with the specified, required delegate
     *
     * @param repository
     */
    KohsukeGitHubRepositoryImpl(final GHRepository repository) {
        assert repository != null : "repository must be specified";
        this.delegate = repository;
    }

    /**
     * {@inheritDoc}
     */
    public String getGitTransportUrl() {
        return delegate.getGitTransportUrl();
    }

    /**
     * {@inheritDoc}
     */
    public String gitHttpTransportUrl() {
        return delegate.gitHttpTransportUrl();
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return delegate.getName();
    }

    /**
     * {@inheritDoc}
     */
    public String getFullName() {
        return delegate.getFullName();
    }
}
