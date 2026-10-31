package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r9m0 implements MobiusLoop.Logger {
    public final String a;

    public r9m0(String str) {
        this.a = str;
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void a(Object obj, Object obj2, Next next) {
        if (next.d()) {
            next.g();
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void b(Object obj, Object obj2, Exception exc) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append("] FATAL ERROR: exception updating model '");
        sb.append(obj);
        sb.append("' with event '");
        Logger.e(exc, td6.l(sb, obj2, "'"), new Object[0]);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void c(Object obj, First first) {
        Object objD = first.d();
        Set setA = first.a();
        Objects.toString(objD);
        Objects.toString(setA);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void d(Object obj, Object obj2) {
        obj2.toString();
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void e(Object obj) {
        obj.toString();
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void f(Object obj, Exception exc) {
        Logger.e(exc, "[" + this.a + "] FATAL ERROR: exception during init '" + obj + "'", new Object[0]);
    }
}
