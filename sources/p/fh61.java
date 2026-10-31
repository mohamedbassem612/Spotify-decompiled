package p;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fh61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh61(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new fxn0(new zm41((dn41) obj2, ec61.O0, (iu30) null, qr51.V0, (Function0) null, new eh61((ni61) obj, (byte) 0), 84));
            case 1:
                ((iu30) obj2).invoke((ws61) obj);
                return rih1Var;
            case 2:
                nt8 nt8Var = (nt8) obj2;
                ObservableSource map = nt8Var.c().map(s9x0.X);
                mt8 mt8Var = nt8Var.a;
                fax faxVarO = EnabledShowsCountRequest.o();
                faxVarO.n();
                nr61 nr61Var = (nr61) obj;
                return RxEventSources.a(new ObservableSource[]{map, mt8Var.a(faxVarO.build()).map(b6j0.i).map(u9x0.t), Observable.combineLatest(nr61Var.d, nr61Var.b.distinctUntilChanged(), nr61Var.c.distinctUntilChanged(), ybx0.X).distinctUntilChanged().map(vbx0.X)});
            case 3:
                vt61 vt61Var = (vt61) obj2;
                i8h1 i8h1Var = vt61Var.b;
                oxl0 oxl0Var = vt61Var.i;
                x6h1 x6h1VarC = oxl0Var.b.c();
                x6h1VarC.i.add(new a7h1("text_filter_clear_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC.a(), oxl0Var.c.b, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj).invoke(new c8e1(0L, 7, (String) null));
                return rih1Var;
            case 4:
                ((iu30) obj2).invoke(new k071((g071) obj));
                return rih1Var;
            case 5:
                ((iu30) obj2).invoke(new k071((f071) obj));
                return rih1Var;
            case 6:
                ((iu30) obj2).invoke(new k071((h071) obj));
                return rih1Var;
            case 7:
                ((iu30) obj2).invoke(new k071((c071) obj));
                return rih1Var;
            case 8:
                ((iu30) obj2).invoke(new k071((d071) obj));
                return rih1Var;
            case 9:
                o771 o771Var = (o771) obj2;
                l420 l420VarP = o771Var.a.p(o771Var.b(), ((String) obj).concat(".mp4"));
                File file = l420VarP.b;
                if (file.exists() && file.setLastModified(o771Var.c.b())) {
                    return l420VarP;
                }
                return null;
            case 10:
                return ((zgq) ((z3i0) obj2).d).a((String) obj);
            case 11:
                return ((u871) obj2).b.a((String) obj);
            case 12:
                hma1 hma1VarEdit = ((fpf) ((u871) obj2).e.getValue()).b.edit();
                hma1VarEdit.a(fpf.d, true);
                hma1VarEdit.g();
                ((qv61) obj).invoke();
                return rih1Var;
            case 13:
                z871 z871Var = ((a971) obj2).d;
                cc71 cc71Var = (cc71) obj;
                i8h1 i8h1Var2 = (i8h1) z871Var.a.get();
                x6h1 x6h1VarC2 = z871Var.c.b.c();
                x6h1VarC2.i.add(new a7h1("share_invite_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", cc71Var.a);
                Uri uri = cc71Var.b;
                if (uri != null) {
                    intent.setClipData(ClipData.newRawUri("link_preview", uri));
                    intent.addFlags(1);
                }
                z871Var.b.startActivity(Intent.createChooser(intent, null));
                return rih1Var;
            case 14:
                if (!((in71) obj2).i) {
                    ((Function0) obj).invoke();
                }
                return rih1Var;
            case 15:
                if (!((l811) obj2).a) {
                    AtomicLong atomicLong = no71.a;
                    Function0 function0 = (Function0) ((ven0) obj).getValue();
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return rih1Var;
            case 16:
                if (((xwa) obj2) != null) {
                    AtomicLong atomicLong2 = no71.a;
                    ((ven0) obj).setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 17:
                new Handler(Looper.getMainLooper()).post(new jyh0((opa) obj2, (qo71) obj, (byte) 21));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((SharedPreferences) obj2).unregisterOnSharedPreferenceChangeListener((qu71) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((iu30) obj2).invoke((mw71) obj);
                return rih1Var;
            case 20:
                ((iu30) obj2).invoke(((ac81) obj).c);
                return rih1Var;
            case 21:
                return ((rd81) obj2).k.a(((xk00) obj).i);
            case 22:
                return ((ee81) obj2).k.a((klv0) ((ajq0) obj).b);
            case 23:
                tka0 tka0Var = dtw.C;
                u3 u3Var = (u3) obj;
                dtw dtwVarD = mhc.d((Context) obj2, (LinearLayout) u3Var.e, (zd81) ((idd1) u3Var.c).getValue(), (drw) null, 24);
                ((FrameLayout) ((idd1) u3Var.b).getValue()).addView(dtwVarD.w);
                return dtwVarD;
            case 24:
                ((iu30) obj2).invoke((qi81) obj);
                return rih1Var;
            case 25:
                wj81 wj81Var = (wj81) obj2;
                String str = nik1.c7.a;
                uba ubaVar = wj81Var.a;
                x6h1 x6h1VarC3 = wj81Var.b.a.c();
                x6h1VarC3.i.add(new a7h1("give_permission_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                ubaVar.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()));
                cd71 cd71Var = (cd71) obj;
                cd71Var.b.a().g1(cd71Var.a, "share-parental-consent-bottom-sheet");
                return rih1Var;
            case 26:
                ymk0 ymk0Var = ((ul81) obj2).b;
                tm81 tm81Var = ((sl81) obj).a;
                if (ymk0Var.b.l(ymk0.c(tm81Var, "interaction_count"), 0) < 1 && ymk0Var.b.l(ymk0.c(tm81Var, "impression_count"), 0) < 3) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                rt01 rt01Var = (rt01) obj;
                return ((pnq) obj2).a((lkw0) rt01Var.c, new cq61(rt01Var, (byte) 24));
            case 28:
                jp80 jp80Var = new jp80(new g8y0((ven0) obj, (byte) 25));
                tt91 tt91Var = (tt91) obj2;
                eq80 eq80Var = new eq80(new e3h1(tt91Var.j, (n7h1) null, tt91Var.i));
                wch wchVar = q6x.b;
                if (!jp80Var.equals(wchVar) || !eq80Var.equals(wchVar)) {
                    if (jp80Var.equals(wchVar)) {
                        return eq80Var;
                    }
                    if (eq80Var.equals(wchVar)) {
                        return jp80Var;
                    }
                    wchVar = new wch(jp80Var, eq80Var);
                }
                return wchVar;
            default:
                ((sq90) obj2).invoke();
                yt91 yt91Var = (yt91) obj;
                pw40 pw40Var = (pw40) yt91Var.d;
                if (pw40Var != null) {
                    pw40Var.a();
                }
                yt91Var.d = null;
                return rih1Var;
        }
    }
}
