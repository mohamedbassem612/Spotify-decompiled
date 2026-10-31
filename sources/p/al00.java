package p;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.spotify.home.evopage.mobius.Event$Refresh;
import com.spotify.home.evopage.mobius.State;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class al00 implements ead1 {
    public final /* synthetic */ el00 a;

    public al00(el00 el00Var) {
        this.a = el00Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    public final void a() {
        String refreshToken;
        el00 el00Var = this.a;
        SwipeRefreshLayout swipeRefreshLayout = el00Var.U0;
        tj00 tj00Var = el00Var.c;
        ie11 ie11Var = el00Var.Z;
        hma1 hma1VarEdit = ie11Var.a.b(ie11Var.b, el00Var.N0).edit();
        hma1VarEdit.a(je11.a, true);
        hma1VarEdit.g();
        lad1 lad1Var = el00Var.X;
        String str = el00Var.O0.a;
        boolean z = el00Var.a1;
        LinkedHashMap linkedHashMap = lad1Var.b;
        if (z) {
            long jB = lad1Var.a.b();
            Object kad1Var = linkedHashMap.get(str);
            if (kad1Var == null) {
                kad1Var = new kad1(0, 0L);
                linkedHashMap.put(str, kad1Var);
            }
            kad1 kad1Var2 = (kad1) kad1Var;
            long j = kad1Var2.b;
            int i = kad1Var2.a;
            if (j != 0 && jB - j >= 300000) {
                linkedHashMap.put(str, new kad1(0, jB));
            } else if (i < 5) {
                linkedHashMap.put(str, new kad1(i + 1, jB));
            } else {
                swipeRefreshLayout.setRefreshing(false);
            }
            tj00Var.l(Event$Refresh.INSTANCE);
            swipeRefreshLayout.setRefreshing(true);
        } else {
            swipeRefreshLayout.setRefreshing(false);
        }
        State.Content content = (State) tj00Var.Q0.e();
        if (content == null) {
            refreshToken = null;
        } else {
            State.Content content2 = content instanceof State.Content ? content : null;
            if (content2 != null) {
                refreshToken = content2.getRefreshToken();
            } else {
                refreshToken = null;
            }
        }
        urk0 urk0Var = el00Var.Z0;
        if (urk0Var != null) {
            i8h1 i8h1Var = el00Var.Y;
            r6h1 r6h1VarB = urk0Var.b();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-pull-to-refresh-loader";
            x6h1VarI.f = "2.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.e = refreshToken;
            y6h1 y6h1VarA = x6h1VarI.a();
            b7x b7xVar = b7x.a;
            i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), y6h1VarA, r6h1VarB, System.currentTimeMillis()), (xj61) null);
        }
    }
}
