package p;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i7w0 implements u331 {
    public static final i7w0 b = new i7w0(0);
    public static final i7w0 c = new i7w0(1);
    public static final i7w0 d = new i7w0(2);
    public static final i7w0 e = new i7w0(3);
    public static final i7w0 f = new i7w0(4);
    public static final i7w0 g = new i7w0(5);
    public static final i7w0 h = new i7w0(6);
    public static final i7w0 i = new i7w0(7);
    public static final i7w0 j = new i7w0(8);
    public final /* synthetic */ byte a;

    public /* synthetic */ i7w0(byte b2) {
        this.a = b2;
    }

    public static jrr0 c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(jrr0.class.getClassLoader());
        return bundle.getParcelable("update_schedule_initial");
    }

    public static Bundle e(jrr0 jrr0Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("update_schedule_initial", jrr0Var);
        return bundle;
    }

    @Override // p.u331
    public final Bundle a(Object obj) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("bluejay_confirm_params", (pxk) obj);
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("prompt_bottom_sheet_input", (arr0) obj);
                return bundle2;
            case 2:
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("quiz_recommendations_page_contract_input", (sjz0) obj);
                return bundle3;
            case 3:
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("rate_bad_question_page_contract_input", (frz0) obj);
                return bundle4;
            case 4:
                d401 d401Var = (d401) obj;
                Bundle bundle5 = new Bundle();
                bundle5.putString("contribution_id", d401Var.a);
                bundle5.putParcelableArrayList("reactions", new ArrayList<>(d401Var.b));
                return bundle5;
            case 5:
                y591 y591Var = (y591) obj;
                if (y591Var instanceof w591) {
                    return mno1.h(new mmr0[]{new mmr0("skip_forward_show_uri", ((w591) y591Var).a)});
                }
                if (y591Var instanceof x591) {
                    return mno1.h(new mmr0[]{new mmr0("skip_forward_selected", ((x591) y591Var).a.name())});
                }
                eg.o();
                return null;
            case 6:
                return e((jrr0) obj);
            case 7:
                return mno1.h(new mmr0[]{new mmr0("extra_bottom_sheet_message", ((dum1) obj).a)});
            default:
                kxm1 kxm1Var = (kxm1) obj;
                return mno1.h(new mmr0[]{new mmr0("VIEW_ID_TO_ALIGN_TOP_WITH_EXTRA", Integer.valueOf(kxm1Var.a)), new mmr0("START_IN_EDIT_MODE", Boolean.valueOf(kxm1Var.b))});
        }
    }

    @Override // p.u331
    public final Class b() {
        switch (this.a) {
            case 0:
                return j7w0.class;
            case 1:
                return brr0.class;
            case 2:
                return tjz0.class;
            case 3:
                return hrz0.class;
            case 4:
                return t501.class;
            case 5:
                return z591.class;
            case 6:
                return jrr0.class;
            case 7:
                return jia1.class;
            default:
                return qxm1.class;
        }
    }

    public ResultReceiver d(Bundle bundle) {
        if (bundle != null) {
            return (ResultReceiver) bundle.getParcelable("update_schedule_result_receiver");
        }
        return null;
    }

    @Override // p.u331
    public final iu30 getUri() {
        switch (this.a) {
            case 0:
                return xuv0.d1;
            case 1:
                return xox0.g;
            case 2:
                return lcz0.W0;
            case 3:
                return gkz0.h;
            case 4:
                return k301.i;
            case 5:
                return er81.O0;
            case 6:
                return osh1.X;
            case 7:
                return tsm1.X;
            default:
                return tsm1.N0;
        }
    }
}
