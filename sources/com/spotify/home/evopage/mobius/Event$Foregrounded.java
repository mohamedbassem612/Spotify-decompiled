package com.spotify.home.evopage.mobius;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/spotify/home/evopage/mobius/Event$Foregrounded;", "Lcom/spotify/home/evopage/mobius/Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Event$Foregrounded implements Event {
    public static final Event$Foregrounded INSTANCE = new Event$Foregrounded();

    private Event$Foregrounded() {
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof Event$Foregrounded);
    }

    public int hashCode() {
        return 41220846;
    }

    public String toString() {
        return "Foregrounded";
    }
}
