package p;

import com.spotify.playlist.ai.creation.v2.Playlist;
import com.spotify.playlist.ai.creation.v2.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e23 extends h7w {
    public final String d;
    public final Status e;
    public final Playlist f;
    public final long g;
    public final long h;
    public final svi0 i;
    public final int j;

    public e23(String str, Status status, Playlist playlist, long j, long j2, svi0 svi0Var, int i) {
        this.d = str;
        this.e = status;
        this.f = playlist;
        this.g = j;
        this.h = j2;
        this.i = svi0Var;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e23)) {
            return false;
        }
        e23 e23Var = (e23) obj;
        return u890.j(this.d, e23Var.d) && this.e.equals(e23Var.e) && u890.j(this.f, e23Var.f) && this.g == e23Var.g && this.h == e23Var.h && this.i.equals(e23Var.i) && this.j == e23Var.j;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        Playlist playlist = this.f;
        return Integer.hashCode(this.j) + ((this.i.hashCode() + cy30.f(cy30.f((iHashCode + (playlist == null ? 0 : playlist.hashCode())) * 31, this.g, 31), this.h, 31)) * 31);
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
