package p;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class up0 {
    public final a1r0 a;

    public static void a(up0 up0Var, String str, String str2, String str3, ResultReceiver resultReceiver, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        boolean z = (i & 8) == 0;
        Set set = s4b1.f;
        a1r0.j(up0Var.a, "spotify:internal:magpie:edit-ucp-prompt:".concat(uic.x(str).h()), (String) null, mno1.h(new mmr0[]{new mmr0("edit_ucp_prompt_text", str2), new mmr0("edit_ucp_prompt_id", str3), new mmr0("edit_ucp_prompt_add_new", Boolean.valueOf(z)), new mmr0("edit_ucp_prompt_result_receiver", resultReceiver)}), true, 2);
    }

    public void b(hs10 hs10Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Double d, String str10) {
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("thumbs_feedback_page_parameters", new zp0(hs10Var, str, str2, str3, str4, str5, str6, str7, str8, str9, l, d, (String) null))});
        a1r0.j(this.a, nik1.h2.a, str10, bundleH, false, 8);
    }
}
