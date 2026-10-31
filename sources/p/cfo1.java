package p;

import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cfo1 extends o02 {
    public final String a;
    public final String b;
    public final n02 c;
    public final v311 d;
    public final Optional e;
    public final Optional f;

    public cfo1(String str, String str2, n02 n02Var, v311 v311Var, Optional optional, Optional optional2) {
        this.a = str;
        this.b = str2;
        this.c = n02Var;
        this.d = v311Var;
        this.e = optional;
        this.f = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o02) {
            cfo1 cfo1Var = (cfo1) ((o02) obj);
            if (this.a.equals(cfo1Var.a) && this.b.equals(cfo1Var.b) && this.c.equals(cfo1Var.c) && this.d.equals(cfo1Var.d) && this.e.equals(cfo1Var.e) && this.f.equals(cfo1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        String string = this.c.toString();
        String string2 = this.d.toString();
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder("AddonMeetingInfo{meetingCode=");
        sb.append(this.a);
        sb.append(", meetingUrl=");
        bb00.j(sb, this.b, ", meetingStatus=", string, ", recordingInfo=");
        bb00.j(sb, string2, ", initialCoWatchingState=", strValueOf, ", initialCoDoingState=");
        return l1d.n(strValueOf2, "}", sb);
    }
}
