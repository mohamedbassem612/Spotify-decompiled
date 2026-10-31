package p;

import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ptb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptb(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ttb) obj).b.a(ggm1.a);
                return rih1Var;
            case 1:
                ((ozb) obj).h.a();
                return rih1Var;
            case 2:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ((z3c) obj).c.f(new dwn0("spotify:home", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1Var;
            case 4:
                return new a9c((b9c) obj);
            case 5:
                return new m9c((c460) ((n9c) obj).c.get(), (byte) 0);
            case 6:
                ((hs20) obj).invoke();
                return rih1Var;
            case 7:
                ufc ufcVar = (ufc) obj;
                luk lukVar = ufcVar.b;
                if (lukVar != null) {
                    return (ufc) lukVar.e(new d26(ufcVar, (byte) 5));
                }
                return null;
            case 8:
                return Float.valueOf(((oic) obj).o);
            case 9:
                dma1 dma1Var = ((pmc) obj).X1;
                if (dma1Var != null) {
                    return l1d.m("https://c.spotify.com?pid=", dma1Var.e(fiq0.d, ""));
                }
                u890.C("preferences");
                throw null;
            case 10:
                return new s10((i6b) obj, (byte) 18);
            case 11:
                Object systemService = ((xuc) obj).a.getSystemService(AudioManager.class);
                systemService.getClass();
                return (AudioManager) systemService;
            case 12:
                ((j6d) obj).a.setValue((Object) null);
                return rih1Var;
            case 13:
                return ((tcd) obj).b.d();
            case 14:
                return new ColorDrawable(((w611) ((sjd) obj)).a.getContext().getColor(2131100234));
            case 15:
                return new ColorDrawable(((w611) ((vkd) obj)).a.getContext().getColor(2131100234));
            case 16:
                imd imdVar = (imd) obj;
                xid xidVar = imdVar.e;
                i8h1 i8h1Var = (i8h1) xidVar.b;
                x6h1 x6h1VarC = ((zok0) xidVar.c).b.c();
                x6h1VarC.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                imdVar.a.g();
                return rih1Var;
            case 17:
                return yoi1.i((mr20) ((ypd) obj).d.getValue(), o6x.a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((ks3) ((o0e) obj).b).a(new ip41(1, 2));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((a3e) ((km0) obj).c).a.stop();
                return rih1Var;
            case 20:
                qlb qlbVar = (qlb) obj;
                r3p r3pVar = (r3p) qlbVar.e;
                d0r d0rVar = qlbVar.b;
                lzn0 lzn0VarC = ((i7c) ((s3p) r3pVar.a.c).X0).c();
                c8o.l(lzn0VarC);
                return new g9e(d0rVar, lzn0VarC);
            case 21:
                rae raeVar = (rae) obj;
                MobiusLoop mobiusLoop = raeVar.b;
                if (mobiusLoop == null) {
                    u890.C("loop");
                    throw null;
                }
                mmr0 mmr0VarR = bin.r(mobiusLoop);
                Disposable disposable = (Disposable) mmr0VarR.a;
                wen0 wen0Var = (wen0) mmr0VarR.b;
                raeVar.c = disposable;
                return wen0Var;
            case 22:
                return (i8h1) ((z1p) ((cce) obj).b).get();
            case 23:
                return hap1.w((RecyclerView) obj);
            case 24:
                eme emeVar = (eme) obj;
                return emeVar.j.a(emeVar.f.d.c.getLifecycle(), false, true, emeVar.k.get());
            case 25:
                return new nu((zne) obj);
            case 26:
                return new cx0((boe) obj);
            case 27:
                return new nu((doe) obj);
            case 28:
                return new cx0((foe) obj);
            default:
                ((qse) obj).h("");
                return rih1Var;
        }
    }
}
