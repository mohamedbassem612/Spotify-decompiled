package p;

import com.spotify.localfiles.settings.localfiles.impl.LocalFilesSettingsValueAccessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rv61 extends hab0 implements iu30 {
    public final /* synthetic */ uy11 N0;
    public final /* synthetic */ b6u O0;
    public final /* synthetic */ ivw0 P0;
    public final /* synthetic */ ol0 Q0;
    public final /* synthetic */ grt X;
    public final /* synthetic */ h581 Y;
    public final /* synthetic */ g981 Z;
    public final /* synthetic */ dao a;
    public final /* synthetic */ j440 b;
    public final /* synthetic */ uce0 c;
    public final /* synthetic */ LocalFilesSettingsValueAccessor d;
    public final /* synthetic */ yfo0 e;
    public final /* synthetic */ bup0 f;
    public final /* synthetic */ r1c1 g;
    public final /* synthetic */ u5x h;
    public final /* synthetic */ qmk1 i;
    public final /* synthetic */ tfo0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv61(LocalFilesSettingsValueAccessor localFilesSettingsValueAccessor, ol0 ol0Var, dao daoVar, grt grtVar, b6u b6uVar, u5x u5xVar, j440 j440Var, uce0 uce0Var, tfo0 tfo0Var, yfo0 yfo0Var, bup0 bup0Var, ivw0 ivw0Var, uy11 uy11Var, h581 h581Var, g981 g981Var, r1c1 r1c1Var, qmk1 qmk1Var) {
        super(1);
        this.a = daoVar;
        this.b = j440Var;
        this.c = uce0Var;
        this.d = localFilesSettingsValueAccessor;
        this.e = yfo0Var;
        this.f = bup0Var;
        this.g = r1c1Var;
        this.h = u5xVar;
        this.i = qmk1Var;
        this.t = tfo0Var;
        this.X = grtVar;
        this.Y = h581Var;
        this.Z = g981Var;
        this.N0 = uy11Var;
        this.O0 = b6uVar;
        this.P0 = ivw0Var;
        this.Q0 = ol0Var;
    }

    public final Object invoke(Object obj) {
        ren0 ren0Var = (ren0) obj;
        pv61 pv61Var = new pv61(this.a, (byte) 7);
        jd11 jd11Var = rc11.a;
        ren0Var.put(jd11Var.b(dao.class), new pv61(pv61Var, (byte) 22));
        ren0Var.put(jd11Var.b(j440.class), new pv61(new pv61(this.b, (byte) 8), (byte) 23));
        ren0Var.put(jd11Var.b(uce0.class), new pv61(new pv61(this.c, (byte) 9), (byte) 24));
        ren0Var.put(jd11Var.b(LocalFilesSettingsValueAccessor.class), new pv61(new pv61(this.d, (byte) 10), (byte) 25));
        ren0Var.put(jd11Var.b(yfo0.class), new pv61(new pv61(this.e, (byte) 11), (byte) 26));
        ren0Var.put(jd11Var.b(bup0.class), new pv61(new pv61(this.f, (byte) 12), (byte) 27));
        ren0Var.put(jd11Var.b(r1c1.class), new pv61(new pv61(this.g, (byte) 13), (byte) 28));
        byte b = 29;
        ren0Var.put(jd11Var.b(u5x.class), new pv61(new pv61(this.h, (byte) 14), b));
        ren0Var.put(jd11Var.b(qmk1.class), new qv61(new pv61(this.i, (byte) 15), (byte) 0));
        ren0Var.put(jd11Var.b(tfo0.class), new pv61(new l451(this.t, b), (byte) 16));
        ren0Var.put(jd11Var.b(grt.class), new pv61(new pv61(this.X, (byte) 0), (byte) 17));
        ren0Var.put(jd11Var.b(h581.class), new pv61(new pv61(this.Y, (byte) 1), (byte) 18));
        ren0Var.put(jd11Var.b(g981.class), new pv61(new pv61(this.Z, (byte) 2), (byte) 19));
        ren0Var.put(jd11Var.b(uy11.class), new pv61(new pv61(this.N0, (byte) 3), (byte) 20));
        ren0Var.put(jd11Var.b(b6u.class), new pv61(new pv61(this.O0, (byte) 4), (byte) 21));
        ren0Var.put(jd11Var.b(ivw0.class), new pv61(this.P0, (byte) 5));
        ren0Var.put(jd11Var.b(ol0.class), new pv61(this.Q0, (byte) 6));
        return rih1.a;
    }
}
