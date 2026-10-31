package p;

import com.spotify.voting.proto.v2.SendVotesRequestV2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jvk1 {
    public final SendVotesRequestV2 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public jvk1(SendVotesRequestV2 sendVotesRequestV2, String str, String str2, String str3, String str4) {
        this.a = sendVotesRequestV2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvk1)) {
            return false;
        }
        jvk1 jvk1Var = (jvk1) obj;
        return this.a.equals(jvk1Var.a) && u890.j(this.b, jvk1Var.b) && u890.j(this.c, jvk1Var.c) && u890.j(this.d, jvk1Var.d) && this.e.equals(jvk1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
