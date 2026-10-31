package p;

import android.os.Bundle;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Action;
import j$.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lig implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public lig(String str, String str2, tv80 tv80Var, xyu xyuVar) {
        this.a = (byte) 2;
        this.b = str;
        this.c = str2;
        this.d = tv80Var;
        this.e = xyuVar;
    }

    public final void run() {
        ou80 ou80Var;
        String str;
        ou80 ou80Var2;
        byte b = this.a;
        tv80 tv80Var = null;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                lag lagVar = (lag) obj4;
                String str2 = (String) obj3;
                wq8 wq8Var = (wq8) obj;
                String str3 = (String) obj2;
                lagVar.n(str2, wq8Var, str3);
                lagVar.m(str2, wq8Var, str3);
                break;
            case 1:
                tjh tjhVar = (tjh) obj4;
                tjhVar.i.onNext(new njh((String) obj3, (String) obj2));
                tjhVar.b(500L, (String) obj);
                break;
            case 2:
                Charset charset = StandardCharsets.UTF_8;
                tv80 tv80Var2 = (tv80) obj4;
                ((lzn0) ((xyu) obj).d.get()).f(new dwn0(gvg.h("spotify:internal:download-over-cellular-dialog?parentPageId=", URLEncoder.encode((String) obj3, charset.name()), "&parentPageUri=", URLEncoder.encode((String) obj2, charset.name())), "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var2 != null ? new bwn0(tv80Var2) : null));
                break;
            case 3:
                ((lvc) ((tzr0) obj4).b).a((slc0) obj, "Samsung", (String) obj3, (String) obj2, 2, 2);
                break;
            case 4:
                ywv0 ywv0Var = (ywv0) obj3;
                if (!((Boolean) obj4).booleanValue()) {
                    ywv0Var.k();
                } else {
                    zwv0 zwv0Var = (zwv0) obj2;
                    if (zwv0Var == zwv0.a) {
                        ywv0Var.k();
                    } else if (zwv0Var == zwv0.b) {
                        ywv0Var.g(nik1.Q5.a, (tv80) obj);
                    }
                }
                break;
            case 5:
                rig0 rig0Var = (tig0) obj4;
                ti11 ti11Var = (ti11) obj3;
                if (!(rig0Var instanceof rig0)) {
                    ti11Var.d.a(jvs0.f);
                    t8r0 t8r0Var = ti11Var.e;
                    hj11 hj11Var = ti11Var.f;
                    ij11 ij11Var = ti11Var.g;
                    b3j0 b3j0Var = new b3j0(false);
                    zkz0 zkz0Var = new zkz0(ti11Var, (PlayerState) obj, (byte) 20);
                    dg30 dg30Var = (dg30) t8r0Var.a;
                    int i = TooltipContainer.P0;
                    TooltipContainer tooltipContainerFindViewById = dg30Var.findViewById(2131431413);
                    tooltipContainerFindViewById.getClass();
                    vnd1 vnd1Var = new vnd1((Object) tooltipContainerFindViewById, (byte) 5);
                    jj11 jj11VarC = ((tz01) t8r0Var.b).c(ij11Var);
                    jj11VarC.e = zkz0Var;
                    vnd1Var.b = jj11VarC;
                    vnd1Var.x(hj11Var.a, b3j0Var);
                } else {
                    a1r0 a1r0Var = ti11Var.Y;
                    String strB = esg1.d.b(rig0Var.a);
                    tqw tqwVar = (tqw) obj2;
                    if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
                        tv80Var = ou80Var.a;
                    }
                    a1r0.j(a1r0Var, strB, tv80Var, (Bundle) null, false, 12);
                }
                break;
            case 6:
                gj11 gj11Var = (gj11) obj4;
                gj11Var.d.a(jvs0.d);
                j380 j380VarMetadata = ((ContextTrack) ((PlayerState) obj3).track().b()).metadata();
                if (j380VarMetadata == null || (str = (String) j380VarMetadata.get("image_xlarge_url")) == null) {
                    str = "";
                }
                a1r0 a1r0Var2 = gj11Var.f;
                String strConcat = "spotify:internal:reinvent-free:back-skip-upsell:".concat(((o0a) obj2).a);
                tqw tqwVar2 = (tqw) obj;
                if (tqwVar2 != null && (ou80Var2 = n3o1.y(tqwVar2).a) != null) {
                    tv80Var = ou80Var2.a;
                }
                a1r0.j(a1r0Var2, strConcat, tv80Var, cy30.g("imageUri", str), false, 8);
                break;
            default:
                tqw tqwVar3 = (tqw) obj;
                ((y991) ((ynb0) ((bs0) obj4).e).get()).a((String) obj3, (d991) obj2, tqwVar3 != null ? n3o1.y(tqwVar3) : null);
                break;
        }
    }

    public /* synthetic */ lig(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    public lig(lag lagVar, String str, wq8 wq8Var, String str2) {
        this.a = (byte) 0;
        this.d = lagVar;
        this.b = str;
        this.e = wq8Var;
        this.c = str2;
    }

    public lig(tzr0 tzr0Var, slc0 slc0Var, String str, String str2) {
        this.a = (byte) 3;
        this.d = tzr0Var;
        this.e = slc0Var;
        this.b = str;
        this.c = str2;
    }
}
