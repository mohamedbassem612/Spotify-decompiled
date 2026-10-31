package p;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ft0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(z7a z7aVar, Context context, h8a h8aVar) {
        super(0);
        this.a = (byte) 4;
        this.b = z7aVar;
        this.c = context;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ji0 ji0Var = (ji0) obj2;
                bt0.a(((nt0) obj).m, at0.BACK_PRESSED, ji0Var.t, k4p1.x(ji0Var.a), null, 52);
                return rih1Var;
            case 1:
                return new w6o0(((uw0) obj).n(2), (w310) ((ynb0) obj2).get(), 12);
            case 2:
                ((dj7) obj).c.add((String) obj2);
                return rih1Var;
            case 3:
                return eso1.p((jma) obj, (px9) obj2);
            case 4:
                z7a z7aVar = (z7a) obj;
                ifl1 ifl1VarA = z7aVar.a.a();
                hfl1 hfl1Var = new hfl1(LayoutInflater.from((Context) obj2));
                ((tak1) ifl1VarA.b).invoke(hfl1Var);
                ViewGroup viewGroupB = hfl1Var.b();
                if (viewGroupB.getParent() != null) {
                    g5a g5aVar = z7aVar.a;
                    n57.e("Banner factory returned view that already has parent, className=" + rc11.a.b(ifl1.class).o());
                    ViewParent parent = viewGroupB.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(viewGroupB);
                    }
                }
                return viewGroupB;
            case 5:
                return uwo1.m(((q940) obj).a((gts0) obj2), fts0.a);
            case 6:
                q4d.a((q4d) obj).q((p4d) obj2);
                return rih1Var;
            case 7:
                ((los) obj).d.remove((iu30) obj2);
                return rih1Var;
            case 8:
                yzu yzuVar = (yzu) obj;
                yzu.a(yzuVar).f();
                yzu.b(yzuVar).a(nmx0.b);
                ((w8w) obj2).dismiss();
                return rih1Var;
            case 9:
                return Integer.valueOf(((List) st60.i((st60) obj).invoke()).indexOf((uqw) obj2));
            case 10:
                ((eub0) obj).a = true;
                return ((Function0) obj2).invoke();
            case 11:
                List list = (List) obj;
                List list2 = (List) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (Object obj3 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str = (String) obj3;
                    str.getClass();
                    arrayList.add(new vrc0(str, ((Number) ((i < 0 || i >= list2.size()) ? -1 : list2.get(i))).intValue()));
                    i = i2;
                }
                return arrayList;
            case 12:
                PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) obj2;
                return wsc0.a(((rsc0) obj).b.b(playlistGetResponse.o()), Integer.valueOf(rsc0.e(playlistGetResponse.q())));
            case 13:
                ((Function0) obj).invoke();
                ((h0f0) obj2).b().invoke();
                return rih1Var;
            case 14:
                iu30 iu30Var = (iu30) obj2;
                pbk0 pbk0Var = (pbk0) obj;
                if (pbk0Var.c()) {
                    iu30Var.invoke(kbk0.a);
                } else if (pbk0Var.b()) {
                    iu30Var.invoke(kbk0.b);
                } else if (pbk0Var.a()) {
                    iu30Var.invoke(kbk0.d);
                } else {
                    iu30Var.invoke(kbk0.c);
                }
                return rih1Var;
            case 15:
                zym0 zym0Var = (zym0) obj;
                Application application = (Application) obj2;
                try {
                    PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                    packageInfo.getClass();
                    return packageInfo;
                } catch (PackageManager.NameNotFoundException e) {
                    eg.f(gvg.h("Could not load package or application info for package ", zym0Var.a, ": ", e.getMessage()));
                    return null;
                }
            case 16:
                ((LinkedHashSet) obj).add(new guo0(1, ((k5a1) obj2).b));
                return rih1Var;
            case 17:
                s7r0 s7r0Var = (s7r0) obj2;
                return (c7r0) ((xu30) obj).invoke(s7r0Var.b, s7r0Var.j, s7r0Var.a);
            case 18:
                ((war0) obj).c((xjr) obj2);
                return rih1Var;
            case 19:
                return (tgm) ((iu30) obj).invoke((nnt0) obj2);
            case 20:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                viewGroup2.getClass();
                ww40 ww40VarB = xw40.b(viewGroup2.getContext(), viewGroup2);
                ww40VarB.getView().setBackground(null);
                g1b.a((g1b) obj2).addView(ww40VarB.getView());
                return ww40VarB;
            case 21:
                ven0 ven0Var = (ven0) obj2;
                r8e1 r8e1VarJ = zc01.j(ven0Var);
                if (r8e1VarJ != null) {
                    ((z680) obj).b(r8e1VarJ);
                    zc01.i(ven0Var);
                }
                return rih1Var;
            case 22:
                cd91 cd91VarL = ngs0.l((ngs0) obj);
                de91 de91Var = (de91) obj2;
                ef91 ef91VarB = de91Var.b();
                String strA = de91Var.a();
                MobiusLoop mobiusLoop = cd91VarL.g;
                if (mobiusLoop != null) {
                    mobiusLoop.a(new je91(strA, ef91VarB));
                }
                return rih1Var;
            case 23:
                return ((ima1) obj).o().getString(((bma1) obj2).a, "");
            case 24:
                ((iu30) obj).invoke((bd10) obj2);
                return rih1Var;
            case 25:
                return g0y0.c((g0y0) obj).a(((xk00) obj2).i);
            default:
                return tvf1.a((btt0) obj2, (String) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(jma jmaVar, px9 px9Var, uv40 uv40Var, l3n1 l3n1Var) {
        super(0);
        this.a = (byte) 3;
        this.b = jmaVar;
        this.c = px9Var;
    }
}
