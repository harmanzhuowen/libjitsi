/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package org.jitsi.service.neomedia;

import net.sf.fmj.media.rtp.*;
import org.jitsi.service.neomedia.rtp.*;

/**
 * @author George Politis
 */
public interface RTCPTerminationStrategy
{
    /**
     * Gets the <tt>Transformer</tt> that is to inspect and modify
     * incoming RTCP packets.
     *
     * @return the <tt>Transformer</tt> that is to inspect and
     * modify incoming RTCP packets.
     */
    RTCPPacketTransformer getRTCPCompoundPacketTransformer();

    /**
     * Gets the <tt>RTCPReportBuilder</tt> that makes the RTCP feedback
     * generated by this <tt>RTCPTerminationStrategy</tt>.
     *
     * @return the <tt>RTCPReportBuilder</tt> that makes the RTCP feedback
     * generated by this <tt>RTCPTerminationStrategy</tt>
     */
    RTCPReportBuilder getRTCPReportBuilder();

    /**
     * Sets the <tt>RTPTranslator</tt> associated to this
     * <tt>RTCPTerminationStrategy</tt>
     *
     * @param translator
     */
    void setRTPTranslator(RTPTranslator translator);

    /**
     * Gets the <tt>RTPTranslator</tt> associated to this
     * <tt>RTCPTerminationStrategy</tt>
     *
     * @return the <tt>RTPTranslator</tt> associated to this
     * <tt>RTCPTerminationStrategy</tt>
     */
    RTPTranslator getRTPTranslator();
}
