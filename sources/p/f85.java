package p;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f85 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f85(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        char c = 1;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                g85 g85Var = (g85) obj;
                luk lukVar = g85Var.b;
                if (lukVar != null) {
                    return lukVar.e(new s65(g85Var, (byte) 13));
                }
                return null;
            case 1:
                h85 h85Var = (h85) obj;
                luk lukVar2 = h85Var.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new s65(h85Var, (byte) 14));
                }
                return null;
            case 2:
                i85 i85Var = (i85) obj;
                luk lukVar3 = i85Var.c;
                if (lukVar3 != null) {
                    return lukVar3.e(new s65(i85Var, (byte) 15));
                }
                return null;
            case 3:
                k85 k85Var = (k85) obj;
                luk lukVar4 = k85Var.b;
                if (lukVar4 != null) {
                    return lukVar4.e(new s65(k85Var, (byte) 16));
                }
                return null;
            case 4:
                l85 l85Var = (l85) obj;
                luk lukVar5 = l85Var.b;
                if (lukVar5 != null) {
                    return (l85) lukVar5.e(new s65(l85Var, (byte) 17));
                }
                return null;
            case 5:
                m85 m85Var = (m85) obj;
                luk lukVar6 = m85Var.b;
                if (lukVar6 != null) {
                    return (m85) lukVar6.e(new s65(m85Var, (byte) 18));
                }
                return null;
            case 6:
                n85 n85Var = (n85) obj;
                feh1 feh1Var = n85Var.b;
                if (feh1Var != null) {
                    return (n85) feh1Var.e(new s65(n85Var, (byte) 19));
                }
                return null;
            case 7:
                p85 p85Var = (p85) obj;
                luk lukVar7 = p85Var.j;
                if (lukVar7 != null) {
                    return lukVar7.e(new s65(p85Var, (byte) 20));
                }
                return null;
            case 8:
                q85 q85Var = (q85) obj;
                feh1 feh1Var2 = q85Var.b;
                if (feh1Var2 != null) {
                    return feh1Var2.e(new s65(q85Var, (byte) 21));
                }
                return null;
            case 9:
                r85 r85Var = (r85) obj;
                feh1 feh1Var3 = r85Var.b;
                if (feh1Var3 != null) {
                    return feh1Var3.e(new s65(r85Var, (byte) 22));
                }
                return null;
            case 10:
                s85 s85Var = (s85) obj;
                luk lukVar8 = s85Var.b;
                if (lukVar8 != null) {
                    return (s85) lukVar8.e(new s65(s85Var, (byte) 23));
                }
                return null;
            case 11:
                t85 t85Var = (t85) obj;
                luk lukVar9 = t85Var.b;
                if (lukVar9 != null) {
                    return (t85) lukVar9.e(new s65(t85Var, (byte) 24));
                }
                return null;
            case 12:
                f95 f95Var = (f95) obj;
                luk lukVar10 = f95Var.g;
                if (lukVar10 != null) {
                    return lukVar10.e(new s65(f95Var, (byte) 25));
                }
                return null;
            case 13:
                g95 g95Var = (g95) obj;
                luk lukVar11 = g95Var.b;
                if (lukVar11 != null) {
                    return lukVar11.e(new s65(g95Var, (byte) 26));
                }
                return null;
            case 14:
                h95 h95Var = (h95) obj;
                luk lukVar12 = h95Var.b;
                if (lukVar12 != null) {
                    return (h95) lukVar12.e(new s65(h95Var, (byte) 27));
                }
                return null;
            case 15:
                j95 j95Var = (j95) obj;
                luk lukVar13 = j95Var.j;
                if (lukVar13 != null) {
                    return lukVar13.e(new s65(j95Var, (byte) 28));
                }
                return null;
            case 16:
                bjg1 bjg1Var = (bjg1) obj;
                Object objP0 = ((mhg1) bjg1Var).a.P0();
                pay payVar = pay.c;
                return Boolean.valueOf(objP0 == payVar && ((mhg1) bjg1Var).d.getValue() == payVar);
            case 17:
                return ((ko5) obj).a.findViewById(2131429608);
            case 18:
                return BehaviorSubject.g(((oo5) obj).a());
            case 19:
                ((SingleEmitter) obj).onSuccess(qn5.a);
                return rih1Var;
            case 20:
                hma1 hma1VarEdit = ((ndb0) ((wo5) obj).b).a.edit();
                hma1VarEdit.f(ndb0.b);
                hma1VarEdit.g();
                return rih1Var;
            case 21:
                bp5 bp5Var = (bp5) obj;
                if (u890.j((e06) ((oo70) bp5Var.e).b.getValue(), d06.a)) {
                    Logger.b("Quasar scopes are exited, app is idle, Stopping ForegroundKeeperService.", new Object[0]);
                    Context context = bp5Var.b;
                    cd30 cd30Var = (cd30) bp5Var.d;
                    cd30Var.getClass();
                    context.stopService(new Intent(cd30Var.a.getApplicationContext(), (Class<?>) ForegroundKeeperService.class));
                } else {
                    Logger.b("App is still active, not stopping ForegroundKeeperService as scopes will re-enter.", new Object[0]);
                }
                return rih1Var;
            case 22:
                return (i8h1) ((qp5) obj).a.get();
            case 23:
                return AppWidgetManager.getInstance(((ox5) obj).a);
            case 24:
                AppWidgetManager.getInstance(((x15) obj).a);
                return rih1Var;
            case 25:
                ((cy5) obj).g.getValue();
                return rih1Var;
            case 26:
                g06 g06Var = (g06) obj;
                g06Var.b.a(g06Var);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                e26 e26Var = (e26) obj;
                luk lukVar14 = e26Var.c;
                if (lukVar14 != null) {
                    return lukVar14.e(new d26(e26Var, b2));
                }
                return null;
            case 28:
                f26 f26Var = (f26) obj;
                feh1 feh1Var4 = f26Var.b;
                if (feh1Var4 != null) {
                    return (f26) feh1Var4.e(new d26(f26Var, c == true ? 1 : 0));
                }
                return null;
            default:
                g26 g26Var = (g26) obj;
                luk lukVar15 = g26Var.l;
                if (lukVar15 != null) {
                    return lukVar15.e(new d26(g26Var, (byte) 2));
                }
                return null;
        }
    }
}
