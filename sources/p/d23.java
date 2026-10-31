package p;

import com.spotify.playlist.ai.creation.v2.Playlist;
import com.spotify.playlist.ai.creation.v2.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d23 extends h7w {
    public final String d;
    public final Status e;
    public final Playlist f;
    public final long g;
    public final long h;
    public final svi0 i;

    public d23(String str, Status status, Playlist playlist, long j, long j2, svi0 svi0Var) {
        this.d = str;
        this.e = status;
        this.f = playlist;
        this.g = j;
        this.h = j2;
        this.i = svi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d23)) {
            return false;
        }
        d23 d23Var = (d23) obj;
        return this.d.equals(d23Var.d) && this.e.equals(d23Var.e) && u890.j(this.f, d23Var.f) && this.g == d23Var.g && this.h == d23Var.h && this.i.equals(d23Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        Playlist playlist = this.f;
        return this.i.hashCode() + cy30.f(cy30.f((iHashCode + (playlist == null ? 0 : playlist.hashCode())) * 31, this.g, 31), this.h, 31);
    }

    public final String q() {
        return this.d;
    }

    public final svi0 r() {
        return this.i;
    }

    public final Playlist s() {
        return this.f;
    }

    public final Status t() {
        return this.e;
    }

    public final long u() {
        return this.g;
    }

    public final long v() {
        return this.h;
    }
}
