package p;

import android.view.View;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uv7 implements sbb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uv7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void a(String str) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (str != null) {
                    vv7 vv7Var = (vv7) obj;
                    ((sen0) obj2).a(str);
                    Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
                    String displayName = Locale.forLanguageTag(str).getDisplayName(localeForLanguageTag);
                    if (displayName.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        char cCharAt = displayName.charAt(0);
                        localeForLanguageTag.getClass();
                        sb.append((Object) eth.U(cCharAt, localeForLanguageTag));
                        sb.append(displayName.substring(1));
                        displayName = sb.toString();
                    }
                    vv7Var.g.k(new er91((fs91) null, vv7Var.h.getString(2131958566, displayName), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                break;
            default:
                tbb0 tbb0Var = (tbb0) obj2;
                rng1 rng1Var = tbb0Var.e;
                String str2 = tbb0Var.b.a;
                rng1Var.d.m((Object) null, new lng1(str));
                rng1Var.e.l(str);
                fn31.T(rng1Var.c, (o8n) null, 0, new l3g1(rng1Var, str2, str, (lnm) null, (byte) 3), 3);
                bpb1 bpb1Var = tbb0Var.f.a;
                ing1 ing1Var = new ing1(str);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, ing1Var);
                ((Function0) obj).invoke();
                break;
        }
    }
}
