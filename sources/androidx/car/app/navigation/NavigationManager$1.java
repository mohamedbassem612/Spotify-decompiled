package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.f;
import p.sge1;
import p.x8c0;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class NavigationManager$1 extends INavigationManager.Stub {
    final /* synthetic */ b this$0;
    final /* synthetic */ x8c0 val$lifecycle;

    public NavigationManager$1(b bVar, x8c0 x8c0Var) {
        this.this$0 = bVar;
        this.val$lifecycle = x8c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onStopNavigation$0() {
        this.this$0.getClass();
        sge1.a();
        return null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        f.c(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new z321() { // from class: androidx.car.app.navigation.a
            @Override // p.z321
            public final Object b() {
                return this.a.lambda$onStopNavigation$0();
            }
        });
    }
}
