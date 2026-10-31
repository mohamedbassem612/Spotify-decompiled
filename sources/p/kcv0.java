package p;

import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kcv0 extends e9p1 {
    public final ClientPollResponse c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public kcv0(ClientPollResponse clientPollResponse, boolean z, List list, boolean z2, boolean z3, String str) {
        this.c = clientPollResponse;
        this.d = z;
        this.e = list;
        this.f = z2;
        this.g = z3;
        this.h = str;
    }

    public static kcv0 q(kcv0 kcv0Var, List list, boolean z, int i) {
        ClientPollResponse clientPollResponse = kcv0Var.c;
        boolean z2 = (i & 2) != 0 ? kcv0Var.d : true;
        if ((i & 4) != 0) {
            list = kcv0Var.e;
        }
        return new kcv0(clientPollResponse, z2, list, z, kcv0Var.g, kcv0Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcv0)) {
            return false;
        }
        kcv0 kcv0Var = (kcv0) obj;
        return this.c.equals(kcv0Var.c) && this.d == kcv0Var.d && u890.j(this.e, kcv0Var.e) && this.f == kcv0Var.f && this.g == kcv0Var.g && this.h.equals(kcv0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(f4i1.b(xcg1.g(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
