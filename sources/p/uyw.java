package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uyw implements Observer {
    public final vku a = new vku();
    public final /* synthetic */ EmailVerifyDispatcherService b;
    public final /* synthetic */ int c;

    public uyw(EmailVerifyDispatcherService emailVerifyDispatcherService, int i) {
        this.b = emailVerifyDispatcherService;
        this.c = i;
    }

    public final void onComplete() {
        this.a.c();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Service, com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void onError(Throwable th) {
        Logger.d(i3a.j("Error: ", th), new Object[0]);
        ?? r0 = this.b;
        if (r0.d == null) {
            u890.C("logger");
            throw null;
        }
        th.getMessage();
        this.a.c();
        r0.stopSelf(this.c);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Service, com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void onNext(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ?? r12 = this.b;
        if (zBooleanValue) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963707});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            er91 er91Var = new er91((fs91) null, "", 2131963707, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            kt91 kt91Var = r12.b;
            if (kt91Var == null) {
                u890.C("snackbarManager");
                throw null;
            }
            boolean zG = kt91Var.g();
            kt91 kt91Var2 = r12.b;
            if (zG) {
                if (kt91Var2 == null) {
                    u890.C("snackbarManager");
                    throw null;
                }
                kt91Var2.k(er91Var);
            } else {
                if (kt91Var2 == null) {
                    u890.C("snackbarManager");
                    throw null;
                }
                kt91Var2.o(er91Var);
            }
            if (r12.d == null) {
                u890.C("logger");
                throw null;
            }
        } else if (r12.d == null) {
            u890.C("logger");
            throw null;
        }
        r12.stopSelf(this.c);
    }

    public final void onSubscribe(Disposable disposable) {
        this.a.a(disposable);
    }
}
