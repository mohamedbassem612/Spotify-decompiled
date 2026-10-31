package p;

import com.spotify.xrprojected.ui.XrProjectedActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nmm1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ XrProjectedActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nmm1(XrProjectedActivity xrProjectedActivity, byte b) {
        super(4);
        this.a = b;
        this.b = xrProjectedActivity;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        XrProjectedActivity xrProjectedActivity = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                hmm1 hmm1Var = new hmm1();
                String name = imm1.class.getName();
                imm1 imm1Var = xrProjectedActivity.f1;
                if (imm1Var == null) {
                    u890.C("xrNpvPageElement");
                    throw null;
                }
                ipb1 ipb1VarC = wpb1.C(name, imm1Var, hmm1Var, b0kVar, 0, 8);
                imm1 imm1Var2 = xrProjectedActivity.f1;
                if (imm1Var2 != null) {
                    otw.c(imm1Var2, hmm1Var, (qim0) null, ipb1VarC, b0kVar, 0, 4);
                    return rih1Var;
                }
                u890.C("xrNpvPageElement");
                throw null;
            default:
                b0k b0kVar2 = (b0k) obj3;
                ((Number) obj4).intValue();
                tmf0 tmf0Var = new tmf0();
                String name2 = umf0.class.getName();
                umf0 umf0Var = xrProjectedActivity.h1;
                if (umf0Var == null) {
                    u890.C("lyricsPageElement");
                    throw null;
                }
                ipb1 ipb1VarC2 = wpb1.C(name2, umf0Var, tmf0Var, b0kVar2, 0, 8);
                umf0 umf0Var2 = xrProjectedActivity.h1;
                if (umf0Var2 != null) {
                    otw.c(umf0Var2, tmf0Var, (qim0) null, ipb1VarC2, b0kVar2, 0, 4);
                    return rih1Var;
                }
                u890.C("lyricsPageElement");
                throw null;
        }
    }
}
