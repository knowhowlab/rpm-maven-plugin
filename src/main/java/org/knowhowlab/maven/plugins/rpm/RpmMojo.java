package org.knowhowlab.maven.plugins.rpm;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "rpm", defaultPhase = LifecyclePhase.VALIDATE, threadSafe = true)
public class RpmMojo extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        // TODO
    }
}
