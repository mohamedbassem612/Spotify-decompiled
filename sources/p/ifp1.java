package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ifp1 extends svg {
    public final String a;
    public final Duration b;
    public final double c;
    public final int d;
    public final rvg e;

    public ifp1(String str, Duration duration, double d, int i, rvg rvgVar) {
        this.a = str;
        this.b = duration;
        this.c = d;
        this.d = i;
        this.e = rvgVar;
    }

    @Override // p.svg
    public final rvg b() {
        return this.e;
    }

    @Override // p.svg
    public final String c() {
        return this.a;
    }

    @Override // p.svg
    public final Duration d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof svg)) {
            return false;
        }
        ifp1 ifp1Var = (ifp1) ((svg) obj);
        return this.a.equals(ifp1Var.a) && this.b.equals(ifp1Var.b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(ifp1Var.c) && l1d.d(this.d, ifp1Var.d) && this.e.equals(ifp1Var.e);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        double d = this.c;
        return this.e.hashCode() ^ (((((iHashCode * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003) ^ l1d.C(this.d)) * 1000003);
    }

    public final String toString() {
        String str;
        String string = this.b.toString();
        int i = this.d;
        if (i == 1) {
            str = "BUFFERING";
        } else if (i == 2) {
            str = "PLAY";
        } else if (i == 3) {
            str = "PAUSE";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "ENDED";
        }
        String string2 = this.e.toString();
        StringBuilder sb = new StringBuilder("CoWatchingState{mediaId=");
        bb00.j(sb, this.a, ", mediaPlayoutPosition=", string, ", mediaPlayoutRate=");
        sb.append(this.c);
        sb.append(", playbackState=");
        sb.append(str);
        return l1d.q(sb, ", coWatchingQueue=", string2, "}");
    }
}
