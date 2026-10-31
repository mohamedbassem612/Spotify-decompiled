package p;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class urn0 implements CompletableSource {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ urn0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void subscribe(CompletableObserver completableObserver) {
        ou80 ou80Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ajq0 ajq0Var = (ajq0) ((zd1) obj2).d;
                ze7 ze7Var = (ze7) obj;
                ((b431) ajq0Var.e).a(new fe7((String) ajq0Var.b, (me7) ajq0Var.a, ze7Var.e), ze7Var.d.a);
                break;
            case 1:
                tbr0 tbr0VarC = ((cir0) ((zd1) obj2).b).c();
                cf7 cf7Var = (cf7) obj;
                List list = cf7Var.d;
                tv80 tv80Var = cf7Var.e;
                tbr0VarC.a(new y231(new qe7((tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a, list, tv80Var)));
                break;
            default:
                ie90 ie90Var = (ie90) obj2;
                AccessibilityManager accessibilityManager = (AccessibilityManager) ie90Var.f;
                Context context = (Context) ie90Var.d;
                AccessibilityEvent accessibilityEventF = Build.VERSION.SDK_INT >= 30 ? k34.f() : AccessibilityEvent.obtain();
                accessibilityEventF.setEventType(2048);
                accessibilityEventF.setClassName(context.getClass().getName());
                accessibilityEventF.setPackageName(context.getPackageName());
                accessibilityEventF.getText().add((String) obj);
                accessibilityManager.sendAccessibilityEvent(accessibilityEventF);
                break;
        }
    }
}
