package p;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dhd1 {
    public CharSequence a;
    public int b;
    public View c;
    public TabLayout d;
    public ghd1 e;

    public final void a(String str) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(str)) {
            this.e.setContentDescription(str);
        }
        this.a = str;
        ghd1 ghd1Var = this.e;
        if (ghd1Var != null) {
            ghd1Var.e();
        }
    }
}
