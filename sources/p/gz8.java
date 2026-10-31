package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gz8 extends uin {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final cin g;
    public final tin h;
    public final sin i;
    public final din j;
    public final List k;
    public final int l;

    public gz8(String str, String str2, String str3, long j, Long l, boolean z, cin cinVar, tin tinVar, sin sinVar, din dinVar, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = cinVar;
        this.h = tinVar;
        this.i = sinVar;
        this.j = dinVar;
        this.k = list;
        this.l = i;
    }

    @Override // p.uin
    public final fz8 a() {
        fz8 fz8Var = new fz8();
        fz8Var.a = this.a;
        fz8Var.b = this.b;
        fz8Var.c = this.c;
        fz8Var.d = this.d;
        fz8Var.e = this.e;
        fz8Var.f = this.f;
        fz8Var.g = this.g;
        fz8Var.h = this.h;
        fz8Var.i = this.i;
        fz8Var.j = this.j;
        fz8Var.k = this.k;
        fz8Var.l = this.l;
        fz8Var.m = (byte) 7;
        return fz8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uin) {
            gz8 gz8Var = (gz8) ((uin) obj);
            if (this.a.equals(gz8Var.a) && this.b.equals(gz8Var.b)) {
                String str = gz8Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == gz8Var.d) {
                        Long l = gz8Var.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == gz8Var.f && this.g.equals(gz8Var.g)) {
                                tin tinVar = gz8Var.h;
                                tin tinVar2 = this.h;
                                if (tinVar2 != null ? tinVar2.equals(tinVar) : tinVar == null) {
                                    sin sinVar = gz8Var.i;
                                    sin sinVar2 = this.i;
                                    if (sinVar2 != null ? sinVar2.equals(sinVar) : sinVar == null) {
                                        din dinVar = gz8Var.j;
                                        din dinVar2 = this.j;
                                        if (dinVar2 != null ? dinVar2.equals(dinVar) : dinVar == null) {
                                            List list = gz8Var.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == gz8Var.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        tin tinVar = this.h;
        int iHashCode4 = (iHashCode3 ^ (tinVar == null ? 0 : tinVar.hashCode())) * 1000003;
        sin sinVar = this.i;
        int iHashCode5 = (iHashCode4 ^ (sinVar == null ? 0 : sinVar.hashCode())) * 1000003;
        din dinVar = this.j;
        int iHashCode6 = (iHashCode5 ^ (dinVar == null ? 0 : dinVar.hashCode())) * 1000003;
        List list = this.k;
        return this.l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return gvg.j(sb, this.l, "}");
    }
}
