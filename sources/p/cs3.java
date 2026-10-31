package p;

import android.content.Intent;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cs3 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AllboardingActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs3(AllboardingActivity allboardingActivity, byte b) {
        super(0);
        this.a = b;
        this.b = allboardingActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        g0i g0iVar = this.b;
        switch (b) {
            case 0:
                wzy wzyVar = EntryPoint.Companion;
                Intent intent = g0iVar.getIntent();
                wzyVar.getClass();
                EntryPoint[] entryPointArrValues = EntryPoint.values();
                EntryPoint entryPoint = EntryPoint.DEFAULT;
                EntryPoint entryPoint2 = (EntryPoint) f46.n0(intent.getIntExtra("entry-point", entryPoint.ordinal()), entryPointArrValues);
                return entryPoint2 == null ? entryPoint : entryPoint2;
            case 1:
                return g0iVar.o();
            case 2:
                return g0iVar.O();
            default:
                mu3 mu3Var = g0iVar.a1;
                if (mu3Var != null) {
                    return mu3Var;
                }
                u890.C("allboardingVMFactory");
                throw null;
        }
    }
}
