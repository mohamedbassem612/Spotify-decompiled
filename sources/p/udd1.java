package p;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class udd1 implements k2q0, em00 {
    public static final /* synthetic */ int t = 0;
    public final awl1 a;
    public final dwl1 b;
    public final Object c = new Object();
    public uvl1 d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final cwh0 h;
    public SystemForegroundService i;

    static {
        qs10.c("SystemFgDispatcher");
    }

    public udd1(Context context) {
        awl1 awl1VarD = awl1.d(context);
        this.a = awl1VarD;
        this.b = awl1VarD.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new cwh0(awl1VarD.j);
        awl1VarD.f.a(this);
    }

    public static Intent b(Context context, uvl1 uvl1Var, bd30 bd30Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", uvl1Var.a);
        intent.putExtra("KEY_GENERATION", uvl1Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", bd30Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", bd30Var.b);
        intent.putExtra("KEY_NOTIFICATION", bd30Var.c);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.app.Service, androidx.work.impl.foreground.SystemForegroundService, java.lang.Object] */
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
    public final void a(uvl1 uvl1Var, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                faa0 faa0Var = ((vwl1) this.f.remove(uvl1Var)) != null ? (faa0) this.g.remove(uvl1Var) : null;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bd30 bd30Var = (bd30) this.e.remove(uvl1Var);
        if (uvl1Var.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (uvl1) entry.getKey();
                if (this.i != null) {
                    bd30 bd30Var2 = (bd30) entry.getValue();
                    ?? r1 = this.i;
                    int i = bd30Var2.a;
                    int i2 = bd30Var2.b;
                    Notification notification = bd30Var2.c;
                    r1.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        g961.k(r1, i, notification, i2);
                    } else if (i3 >= 29) {
                        g961.i(r1, i, notification, i2);
                    } else {
                        r1.startForeground(i, notification);
                    }
                    this.i.d.cancel(bd30Var2.a);
                }
            } else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        if (bd30Var == null || systemForegroundService == null) {
            return;
        }
        qs10 qs10VarA = qs10.a();
        uvl1Var.toString();
        qs10VarA.getClass();
        systemForegroundService.d.cancel(bd30Var.a);
    }

    public final void c(vwl1 vwl1Var, ojl ojlVar) {
        if (ojlVar instanceof njl) {
            qs10.a().getClass();
            uvl1 uvl1VarZ = yoi1.z(vwl1Var);
            int i = ((njl) ojlVar).a;
            awl1 awl1Var = this.a;
            awl1Var.d.a(new qvb(awl1Var.f, new mkb1(uvl1VarZ), true, i));
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [android.app.Service, androidx.work.impl.foreground.SystemForegroundService, java.lang.Object] */
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
    public final void e(Intent intent) {
        if (this.i == null) {
            eg.m("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        uvl1 uvl1Var = new uvl1(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        qs10.a().getClass();
        if (notification == null) {
            hhg1.n("Notification passed in the intent was null.");
            return;
        }
        bd30 bd30Var = new bd30(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(uvl1Var, bd30Var);
        bd30 bd30Var2 = (bd30) linkedHashMap.get(this.d);
        if (bd30Var2 == null) {
            this.d = uvl1Var;
        } else {
            this.i.d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((bd30) ((Map.Entry) it.next()).getValue()).b;
                }
                bd30Var = new bd30(bd30Var2.a, bd30Var2.c, i);
            } else {
                bd30Var = bd30Var2;
            }
        }
        ?? r7 = this.i;
        int i2 = bd30Var.a;
        int i3 = bd30Var.b;
        Notification notification2 = bd30Var.c;
        r7.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            g961.k(r7, i2, notification2, i3);
        } else if (i4 >= 29) {
            g961.i(r7, i2, notification2, i3);
        } else {
            r7.startForeground(i2, notification2);
        }
    }

    public final void f() {
        this.i = null;
        synchronized (this.c) {
            try {
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((faa0) it.next()).d((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        lsw0 lsw0Var = this.a.f;
        synchronized (lsw0Var.k) {
            lsw0Var.j.remove(this);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.app.Service, androidx.work.impl.foreground.SystemForegroundService] */
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
    public final void g(int i, int i2) {
        qs10.a().getClass();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((bd30) entry.getValue()).b == i2) {
                uvl1 uvl1Var = (uvl1) entry.getKey();
                awl1 awl1Var = this.a;
                awl1Var.d.a(new qvb(awl1Var.f, new mkb1(uvl1Var), true, -128));
            }
        }
        ?? r7 = this.i;
        if (r7 != 0) {
            r7.b = true;
            qs10.a().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                r7.stopForeground(true);
            }
            r7.stopSelf(i);
        }
    }
}
