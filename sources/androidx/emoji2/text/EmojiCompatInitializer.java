package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p.a4x;
import p.b4x;
import p.c4x;
import p.cd80;
import p.iac0;
import p.uo5;
import p.x8c0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class EmojiCompatInitializer implements cd80 {
    @Override // p.cd80
    public final Object create(Context context) {
        Object objZ;
        c4x c4xVar = new c4x(context);
        if (a4x.j == null) {
            synchronized (a4x.i) {
                try {
                    if (a4x.j == null) {
                        a4x.j = new a4x(c4xVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        uo5 uo5VarF = uo5.F(context);
        uo5VarF.getClass();
        synchronized (uo5.f) {
            try {
                objZ = ((HashMap) uo5VarF.b).get(ProcessLifecycleInitializer.class);
                if (objZ == null) {
                    objZ = uo5VarF.z(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        x8c0 lifecycle = ((iac0) objZ).getLifecycle();
        lifecycle.a(new b4x(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // p.cd80
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
