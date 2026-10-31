package p;

import android.app.AlertDialog;
import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.campfire.share.impl.ShareSheetOnPlatformSectionImpl;
import com.spotify.share.sheet.sections.offplatform.impl.ShareSheetOffPlatformSectionImpl;
import com.spotify.share.sheet.sections.preview.disclosure.impl.ShareSheetDisclosureSectionImpl;
import com.spotify.share.sheet.sections.preview.previewrow.impl.ShareSheetPreviewSectionImpl;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qv61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv61(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new ol0((pv61) obj, (byte) 15);
            case 1:
                return (c9n) ((uv61) obj).c.b;
            case 2:
                return (c9n) obj;
            case 3:
                return (rhf) ((qud) ((e821) obj).e).invoke();
            case 4:
                y441 y441Var = (y441) obj;
                return ((oi) y441Var.b).n(((Context) y441Var.a).getApplicationContext().getCacheDir(), "shareablesdir");
            case 5:
                return new kpg0(((k871) obj).b, s571.Z);
            case 6:
                ((p871) obj).b.invoke();
                return rih1Var;
            case 7:
                z3i0 z3i0Var = (z3i0) obj;
                if (!z3i0Var.b) {
                    dma1 dma1Var = ((fpf) ((idd1) z3i0Var.f).getValue()).b;
                    hma1 hma1VarEdit = dma1Var.edit();
                    bma1 bma1Var = fpf.e;
                    hma1VarEdit.b(bma1Var, dma1Var.l(bma1Var, 0) + 1);
                    hma1VarEdit.g();
                    z3i0Var.b = true;
                }
                return rih1Var;
            case 8:
                s871 s871Var = (s871) obj;
                s871Var.a2.invoke();
                i8h1 i8h1Var = s871Var.Z1;
                if (i8h1Var == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                uvk0 uvk0Var = s871Var.b2;
                if (uvk0Var == null) {
                    u890.C("mobileChatEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = uvk0Var.a.c();
                x6h1VarC.i.add(new a7h1("share_history_sheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                s871Var.dismiss();
                return rih1Var;
            case 9:
                return ((ShareSheetDisclosureSectionImpl) obj).a;
            case 10:
                return new kpg0(((ShareSheetOffPlatformSectionImpl) obj).a, s571.e1);
            case 11:
                return new kpg0(((ShareSheetOnPlatformSectionImpl) obj).a, qi71.g);
            case 12:
                return Integer.valueOf(((dl71) obj).a.s());
            case 13:
                return new kpg0(((ShareSheetPreviewSectionImpl) obj).a, qi71.Z);
            case 14:
                in71 in71Var = (in71) obj;
                LinkedHashMap linkedHashMap = in71Var.h;
                if (linkedHashMap.values().contains(ym71.c)) {
                    linkedHashMap.replaceAll(kdz0.d);
                    fn31.T(in71Var.e, (o8n) null, 0, new fn71(in71Var, (lnm) null, (byte) 0), 3);
                }
                return rih1Var;
            case 15:
                yp71 yp71Var = (yp71) obj;
                i8h1 i8h1Var2 = yp71Var.c;
                uxl0 uxl0Var = (uxl0) yp71Var.Y.getValue();
                uxl0Var.getClass();
                x6h1 x6h1VarC3 = uxl0Var.a.c();
                x6h1VarC3.i.add(new a7h1("gotit_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 16:
                ps71 ps71Var = (ps71) obj;
                s3q s3qVar = ps71Var.a;
                lzn0 lzn0Var = ps71Var.b;
                switch (s3qVar.a) {
                    case 0:
                        return new ls71((gw70) s3qVar.b.b.d8.get(), lzn0Var);
                    default:
                        return new ls71((gw70) s3qVar.b.b.d8.get(), lzn0Var);
                }
            case 17:
                ru71 ru71Var = (ru71) obj;
                return ru71Var.b.c(ru71Var.a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((m861) obj).invoke();
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((m861) obj).invoke();
                return rih1Var;
            case 20:
                i181 i181Var = (i181) obj;
                i081 i081Var = i181Var.d;
                return new p081(i081Var.a, i081Var.b, i081Var.c, i181Var.b, i081Var.d);
            case 21:
                return ((s8q) obj).a("android-download-dataelement", true);
            case 22:
                ((fv00) obj).dispose();
                return rih1Var;
            case 23:
                ((r961) obj).C(new xi91(1, (tv80) null));
                return rih1Var;
            case 24:
                lba lbaVar = (lba) obj;
                return ((y390) lbaVar.c).a((iac0) lbaVar.e, ((zok0) lbaVar.f).b());
            case 25:
                m021 m021Var = (m021) ((yon) obj).d;
                i8h1 i8h1Var3 = (i8h1) m021Var.b;
                x6h1 x6h1VarC4 = ((dsk0) m021Var.c).b.c();
                x6h1VarC4.i.add(new a7h1("dismiss_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 26:
                try {
                    ((AlertDialog) obj).dismiss();
                    break;
                } catch (IllegalArgumentException unused) {
                }
                return rih1Var;
            case 27:
                u961 u961Var = (u961) obj;
                return ((su70) u961Var.a).b(j690.g, (hjc) u961Var.b, (lzn0) u961Var.c, wgo1.a, true, false, false, false, (7904 & 256) == 0, false, false, null, null);
            case 28:
                y441 y441Var2 = (y441) obj;
                DateFormat patternInstance = DateFormat.getPatternInstance("MMMdy", (Locale) ((idd1) y441Var2.a).getValue());
                patternInstance.setTimeZone((TimeZone) y441Var2.b);
                return patternInstance;
            default:
                return ycm.a(((rd81) obj).i);
        }
    }
}
