package p;

import android.icu.text.DateFormat;
import android.net.Uri;
import android.os.Environment;
import android.view.ViewGroup;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l5v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5v0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object m231Var;
        zf30 zf30VarB;
        zf30 zf30VarB2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (i8h1) m5v0.c((m5v0) obj).get();
            case 1:
                List listA = ((zvw0) obj).a();
                ArrayList arrayList = new ArrayList();
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    try {
                        Uri uri = Uri.parse((String) it.next());
                        String scheme = uri.getScheme();
                        String host = uri.getHost();
                        m231Var = (scheme != null && host != null) ? scheme + "://" + host : null;
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    String str = (String) m231Var;
                    if (str != null) {
                        arrayList.add(str);
                    }
                    break;
                }
                return arrayList;
            case 2:
                return ycm.a(((anx0) obj).c);
            case 3:
                return ((iox0) obj).b.e();
            case 4:
                return i5y0.a((i5y0) obj).b(p7h.M(r1y0.a, q1y0.a));
            case 5:
                ppy0 ppy0Var = (ppy0) obj;
                luk lukVarA = ppy0.a(ppy0Var);
                if (lukVarA != null) {
                    return lukVarA.e(new c44(ppy0Var, (byte) 15));
                }
                return null;
            case 6:
                rqz0 rqz0Var = (rqz0) obj;
                return Integer.valueOf(rqz0.c(rqz0Var).hashCode() + (rqz0.b(rqz0Var).hashCode() * 31));
            case 7:
                ((su01) obj).d(ou01.b);
                return rih1Var;
            case 8:
                lwh0 lwh0Var = ((pr31) obj).l;
                return Boolean.valueOf(lwh0Var != null ? lwh0Var.f() : false);
            case 9:
                k370 k370Var = new k370();
                k370Var.i(m3i1.b);
                k370Var.e("image-upload.spotify.com");
                return (s080) ((RetrofitMaker) obj).createCustomHostService(s080.class, k370Var.b());
            case 10:
                ((ObservableEmitter) obj).onNext(kn41.a);
                return rih1Var;
            case 11:
                ((ur41) obj).a = oa41.t;
                return rih1Var;
            case 12:
                return (ttm0) ((p811) obj).a;
            case 13:
                uu0 uu0Var = (uu0) obj;
                return new w460(uu0.f(uu0Var), false, true, uu0.g(uu0Var), (a1r0) null, 48);
            case 14:
                ((h961) obj).a.invoke();
                return rih1Var;
            case 15:
                return ywv0.a((ywv0) obj).a.map(c4x0.X).distinctUntilChanged().toFlowable(BackpressureStrategy.d).U(Boolean.FALSE);
            case 16:
                return y441.d((y441) obj).a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
            case 17:
                Collection<xs71> collectionD = ((pv71) obj).i.b().d().d();
                if (!(collectionD instanceof Collection) || !collectionD.isEmpty()) {
                    for (xs71 xs71Var : collectionD) {
                        if (xs71Var.d() || xs71Var.e()) {
                        }
                    }
                }
                return rih1Var;
            case 18:
                return f6o1.j((ViewGroup.LayoutParams) null, apo.j(856101448, new c771((i181) obj, (byte) 18), true), 7);
            case 19:
                y441 y441Var = (y441) obj;
                DateFormat patternInstance = DateFormat.getPatternInstance("MMMd", y441.e(y441Var));
                patternInstance.setTimeZone(y441.f(y441Var));
                return patternInstance;
            case 20:
                return ((rd81) obj).e.e();
            case 21:
                return new xho(((xk00) obj).a);
            case 22:
                return xzn1.m(new CosmosTransport(new opy0(((ip91) obj).i, (byte) 4)));
            case 23:
                return ((jn41) ((ln41) obj)).a;
            case 24:
                uwn0 uwn0Var = ((SpotifyMainActivity) obj).i1;
                if (uwn0Var == null) {
                    u890.C("navigationStateLogger");
                    throw null;
                }
                StringBuilder sb = new StringBuilder();
                yun0 yun0Var = uwn0Var.a;
                xun0 xun0VarH = yun0Var.h();
                if (xun0VarH != null && (zf30VarB2 = xun0VarH.b()) != null) {
                    sb.append("active: ");
                    sb.append(zf30VarB2.getClass());
                    sb.append('\n');
                }
                xun0 xun0VarM = yun0Var.m();
                if (xun0VarM != null && (zf30VarB = xun0VarM.b()) != null) {
                    sb.append("active overlay: ");
                    sb.append(zf30VarB.getClass());
                    sb.append('\n');
                }
                for (q0a q0aVar : yun0Var.i()) {
                    sb.append("inactive: ");
                    sb.append(q0aVar.b().a());
                    sb.append('\n');
                }
                for (q0a q0aVar2 : yun0Var.l()) {
                    sb.append("inactive overlays: ");
                    sb.append(q0aVar2.b().a());
                    sb.append('\n');
                }
                return sb.toString();
            case 25:
                km0.f((km0) obj).b();
                return rih1Var;
            case 26:
                ((q7r0) obj).c("");
                return rih1Var;
            case 27:
                return Integer.valueOf(((xtb0) obj).h().o);
            case 28:
                km0.d((km0) obj).b();
                return rih1Var;
            default:
                wai0 wai0Var = (wai0) obj;
                return d5p1.t(wai0.b(wai0Var).a(), cto1.q(wai0.c(wai0Var)), ey71.a, (Object) null);
        }
    }
}
