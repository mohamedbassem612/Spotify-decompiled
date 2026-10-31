package p;

import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d0m extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContentPickerFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0m(ContentPickerFragment contentPickerFragment, byte b) {
        super(2);
        this.a = b;
        this.b = contentPickerFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        byte b = this.a;
        String str6 = "";
        rih1 rih1Var = rih1.a;
        ContentPickerFragment contentPickerFragment = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                String str7 = (String) obj2;
                i3h1 i3h1VarB1 = contentPickerFragment.b1();
                ro41 ro41Var = (ro41) ((MobiusLoopViewModel) contentPickerFragment.d1()).b.e();
                if (ro41Var != null && (str = ro41Var.a) != null) {
                    str6 = str;
                }
                ((j3h1) i3h1VarB1).g(iIntValue, str6, str7);
                break;
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                String str8 = (String) obj2;
                i3h1 i3h1VarB2 = contentPickerFragment.b1();
                ro41 ro41Var2 = (ro41) ((MobiusLoopViewModel) contentPickerFragment.d1()).b.e();
                if (ro41Var2 != null && (str2 = ro41Var2.a) != null) {
                    str6 = str2;
                }
                ((j3h1) i3h1VarB2).g(iIntValue2, str6, str8);
                break;
            case 2:
                jxs0 jxs0Var = (jxs0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                i3h1 i3h1VarB3 = contentPickerFragment.b1();
                ro41 ro41Var3 = (ro41) ((MobiusLoopViewModel) contentPickerFragment.d1()).b.e();
                if (ro41Var3 != null && (str3 = ro41Var3.a) != null) {
                    str6 = str3;
                }
                ((j3h1) i3h1VarB3).i(str6, iIntValue3, jxs0Var);
                break;
            case 3:
                ((Number) obj2).intValue();
                contentPickerFragment.d1().U(new uzl((gxs0) obj, null, 6));
                break;
            case 4:
                int iIntValue4 = ((Number) obj).intValue();
                String str9 = (String) obj2;
                i3h1 i3h1VarB4 = contentPickerFragment.b1();
                ro41 ro41Var4 = (ro41) ((MobiusLoopViewModel) contentPickerFragment.d1()).b.e();
                if (ro41Var4 != null && (str4 = ro41Var4.a) != null) {
                    str6 = str4;
                }
                ((j3h1) i3h1VarB4).g(iIntValue4, str6, str9);
                break;
            case 5:
                contentPickerFragment.d1().U(new uzl((gxs0) obj, (tv80) obj2, 2));
                break;
            default:
                gxs0 gxs0Var = (gxs0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                i3h1 i3h1VarB5 = contentPickerFragment.b1();
                ro41 ro41Var5 = (ro41) ((MobiusLoopViewModel) contentPickerFragment.d1()).b.e();
                if (ro41Var5 != null && (str5 = ro41Var5.a) != null) {
                    str6 = str5;
                }
                ((j3h1) i3h1VarB5).i(str6, iIntValue5, gxs0Var);
                break;
        }
        return rih1Var;
    }
}
