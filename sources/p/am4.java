package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class am4 implements pdy0 {
    public final yl4 a;
    public final zl4 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final luk g;
    public final idd1 h = new idd1(new gk4(this, (byte) 19));

    public am4(yl4 yl4Var, zl4 zl4Var, int i, int i2, int i3, int i4, luk lukVar) {
        this.a = yl4Var;
        this.b = zl4Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = lukVar;
    }

    public final am4 a() {
        return (am4) this.h.getValue();
    }

    public final yl4 b() {
        yl4 yl4VarB;
        am4 am4VarA = a();
        return (am4VarA == null || (yl4VarB = am4VarA.b()) == null) ? this.a : yl4VarB;
    }

    public final zl4 c() {
        zl4 zl4VarC;
        am4 am4VarA = a();
        return (am4VarA == null || (zl4VarC = am4VarA.c()) == null) ? this.b : zl4VarC;
    }

    public final int d() {
        am4 am4VarA = a();
        return am4VarA != null ? am4VarA.d() : this.c;
    }

    public final int e() {
        am4 am4VarA = a();
        return am4VarA != null ? am4VarA.e() : this.d;
    }

    public final int f() {
        am4 am4VarA = a();
        return am4VarA != null ? am4VarA.f() : this.e;
    }

    public final int g() {
        am4 am4VarA = a();
        return am4VarA != null ? am4VarA.g() : this.f;
    }

    @Override // p.pdy0
    public final List models() {
        String str = b().a;
        yl4[] yl4VarArrValues = yl4.values();
        ArrayList arrayList = new ArrayList(yl4VarArrValues.length);
        for (yl4 yl4Var : yl4VarArrValues) {
            arrayList.add(yl4Var.a);
        }
        fpb fpbVar = new fpb("video_metered_quality", "android-libs-betamax-video-quality", str, arrayList);
        String str2 = c().a;
        zl4[] zl4VarArrValues = zl4.values();
        ArrayList arrayList2 = new ArrayList(zl4VarArrValues.length);
        for (zl4 zl4Var : zl4VarArrValues) {
            arrayList2.add(zl4Var.a);
        }
        return p7h.M(fpbVar, new fpb("video_non_metered_quality", "android-libs-betamax-video-quality", str2, arrayList2), new fpb("video_quality_high", "android-libs-betamax-video-quality", d(), 100, 10000), new fpb("video_quality_low", "android-libs-betamax-video-quality", e(), 100, 10000), new fpb("video_quality_medium", "android-libs-betamax-video-quality", f(), 100, 10000), new fpb("video_quality_very_high", "android-libs-betamax-video-quality", g(), 100, Integer.MAX_VALUE));
    }
}
