package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class z implements UserPrincipal {
    public final /* synthetic */ a0 a;

    public /* synthetic */ z(a0 a0Var) {
        this.a = a0Var;
    }

    public static /* synthetic */ UserPrincipal a(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        if (a0Var instanceof y) {
            return ((y) a0Var).a;
        }
        return a0Var instanceof t ? ((t) a0Var).a : new z(a0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        a0 a0Var = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return a0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
