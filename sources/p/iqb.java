package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.accountswitching.v1.Account;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class iqb implements iu30 {
    public final /* synthetic */ Brush a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ DrawStyle d;

    public /* synthetic */ iqb(Brush brush, long j, long j2, DrawStyle drawStyle) {
        this.a = brush;
        this.b = j;
        this.c = j2;
        this.d = drawStyle;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        DrawScope.S0(lslVar, this.a, this.b, this.c, 0.0f, this.d, (ColorFilter) null, 0, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER);
        return rih1.a;
    }
}
