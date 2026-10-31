package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import app.p000rive.semantics.SemanticState;
import java.util.Objects;
import java.util.UUID;
import p.aih0;
import p.awl1;
import p.bzn1;
import p.qs10;
import p.udd1;
import p.yac0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class SystemForegroundService extends yac0 {
    public static final /* synthetic */ int e = 0;
    public boolean b;
    public udd1 c;
    public NotificationManager d;

    static {
        qs10.c("SystemFgService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        udd1 udd1Var = new udd1(getApplicationContext());
        this.c = udd1Var;
        if (udd1Var.i != null) {
            qs10.a().getClass();
        } else {
            udd1Var.i = this;
        }
    }

    public final void onCreate() {
        super.onCreate();
        i();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.app.Service, androidx.work.impl.foreground.SystemForegroundService] */
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
    public final int onStartCommand(Intent intent, int i, int i2) {
        super/*android.app.Service*/.onStartCommand(intent, i, i2);
        if (this.b) {
            qs10.a().getClass();
            this.c.f();
            i();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        udd1 udd1Var = this.c;
        udd1Var.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            qs10 qs10VarA = qs10.a();
            Objects.toString(intent);
            qs10VarA.getClass();
            udd1Var.b.a(new aih0(udd1Var, intent.getStringExtra("KEY_WORKSPEC_ID"), (byte) 27));
            udd1Var.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            udd1Var.e(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            qs10 qs10VarA2 = qs10.a();
            Objects.toString(intent);
            qs10VarA2.getClass();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            awl1 awl1Var = udd1Var.a;
            UUID uuidFromString = UUID.fromString(stringExtra);
            awl1Var.getClass();
            bzn1.q(uuidFromString, awl1Var);
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        qs10.a().getClass();
        ?? r2 = udd1Var.i;
        if (r2 == 0) {
            return 3;
        }
        r2.b = true;
        qs10.a().getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            r2.stopForeground(true);
        }
        r2.stopSelf(i2);
        return 3;
    }

    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.g(i, SemanticState.Modal);
    }

    public final void onTimeout(int i, int i2) {
        this.c.g(i, i2);
    }
}
