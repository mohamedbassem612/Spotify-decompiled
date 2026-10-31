package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aft extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a4v0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aft(a4v0 a4v0Var, byte b) {
        super(4);
        this.a = b;
        this.b = a4v0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        a4v0 a4v0Var = this.b;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) obj4;
                bvn bvnVar = new bvn(iu30Var, (byte) 3);
                a4v0Var.getClass();
                b4v0 b4v0VarA = a4v0.a(bvnVar);
                hrr0 hrr0VarQ = v8r.q((Object) null);
                ComposeView composeView = new ComposeView((Context) obj2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                composeView.setId(2131428356);
                composeView.setContent(new j2i(1227735156, new zet(hrr0VarQ, b4v0VarA, iu30Var, (byte) 1), true));
                return new yet(composeView, hrr0VarQ, (byte) 0);
            default:
                return new as0(a4v0Var, (Context) obj2, (iu30) obj4);
        }
    }
}
