package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ppm0 {
    public final ljf1 a;
    public final uzf1 b;
    public final gtf1 c;
    public final bwg1 d;
    public final boolean e;
    public final boolean f;
    public int g;
    public ie30 h;

    public ppm0(ljf1 ljf1Var, uzf1 uzf1Var, gtf1 gtf1Var) {
        this.a = ljf1Var;
        this.b = uzf1Var;
        this.c = gtf1Var;
        int i = ljf1Var.b;
        ie30 ie30Var = ljf1Var.g;
        this.e = i == 2;
        this.f = Objects.equals(ie30Var.f66p, "application/x-itut-t35");
        this.d = "audio/true-hd".equals(ie30Var.f66p) ? new bwg1() : null;
    }
}
