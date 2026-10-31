package p;

import android.content.res.Resources;
import android.os.Bundle;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class afe implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public afe(qnv0 qnv0Var, dg30 dg30Var, int i) {
        this.a = (byte) 1;
        this.c = qnv0Var;
        this.d = dg30Var;
        this.b = i;
    }

    public final void run() {
        hxy0 hxy0Var;
        ou80 ou80Var;
        ou80 ou80Var2;
        String string;
        byte b = this.a;
        String str = null;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((bfe) obj2).c.a(i, (tv80) obj);
                break;
            case 1:
                kly0 kly0Var = ((qnv0) obj2).c;
                dg30 dg30Var = (dg30) obj;
                if (!((dto0) kly0Var.get()).a.g(dg30Var) && !dg30Var.isFinishing() && !dg30Var.isDestroyed()) {
                    dto0 dto0Var = (dto0) kly0Var.get();
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        hxy0Var = hxy0.NOTIFICATION_PREFERENCE_SETTINGS_TOGGLE;
                    } else if (iC == 1) {
                        hxy0Var = hxy0.IN_APP_MESSAGE_NOTIF_PREFERENCE_TOGGLE;
                    } else if (iC == 2) {
                        hxy0Var = hxy0.PROMPT_PLAYLIST_GENERATING;
                    } else if (iC == 3) {
                        hxy0Var = hxy0.PODCAST_COMMENTS_BOTTOMSHEET;
                    } else if (iC == 4) {
                        hxy0Var = hxy0.MESSAGING_NOTIFICATION_OPT_IN_NUDGE;
                    } else if (iC != 6) {
                        hxy0Var = iC != 7 ? hxy0.UNKNOWN : hxy0.ALLBOARDING_OPT_IN;
                    } else {
                        hxy0Var = hxy0.REINSTALL_EDUCATION_PAGE;
                    }
                    dto0Var.c(dg30Var, hxy0Var, new uwy0(dg30Var.getResources().getString(2131959441), dg30Var.getResources().getString(2131959438), dg30Var.getResources().getString(2131959440), dg30Var.getResources().getString(2131959439)), hlv0.c);
                    break;
                }
                break;
            case 2:
                a1r0 a1r0Var = ((ri11) obj2).g;
                String strB = dsg1.d.b(i);
                tqw tqwVar = (tqw) obj;
                if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
                    str = ou80Var.a;
                }
                a1r0.j(a1r0Var, strB, str, (Bundle) null, false, 12);
                break;
            case 3:
                a1r0 a1r0Var2 = ((gj11) obj2).f;
                String strB2 = gsg1.d.b(i);
                tqw tqwVar2 = (tqw) obj;
                if (tqwVar2 != null && (ou80Var2 = n3o1.y(tqwVar2).a) != null) {
                    str = ou80Var2.a;
                }
                a1r0.j(a1r0Var2, strB2, str, (Bundle) null, false, 12);
                break;
            case 4:
                ik21 ik21Var = (ik21) obj2;
                yna0 yna0Var = ik21Var.e;
                String str2 = ((gk21) obj).a;
                Resources resources = yna0Var.a;
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    string = resources.getString(2131961251, str2);
                    string.getClass();
                } else if (iC2 != 1) {
                    eg.o();
                } else {
                    string = resources.getString(2131961252, str2);
                    string.getClass();
                }
                ik21Var.a(string);
                break;
            default:
                il91 il91Var = (il91) obj2;
                il91Var.g.c(new wr3(il91Var, i, (d7e) obj, (byte) 10));
                break;
        }
    }

    public /* synthetic */ afe(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
