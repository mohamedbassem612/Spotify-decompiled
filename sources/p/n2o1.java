package p;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n2o1 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ xaa b;

    public n2o1(xaa xaaVar, int i) {
        this.b = xaaVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        xaa xaaVar = this.b;
        if (iBinder == null) {
            xaaVar.J();
            return;
        }
        synchronized (xaaVar.L()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                xaaVar.M((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mbn1)) ? new mbn1(iBinder) : (mbn1) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.F(0, this.a, (Bundle) null);
    }

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
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        xaa xaaVar = this.b;
        synchronized (xaaVar.L()) {
            xaaVar.M((mbn1) null);
        }
        xaa xaaVar2 = this.b;
        int i = this.a;
        jim0 jim0Var = xaaVar2.f;
        jim0Var.sendMessage(jim0Var.obtainMessage(6, i, 1));
    }
}
