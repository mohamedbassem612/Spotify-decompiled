package com.spotify.scannables.scannables.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.spotify.scannables.scannables.view.ScannablesOnboardingActivity;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p.a7h1;
import p.b7x;
import p.bx4;
import p.dx4;
import p.f46;
import p.i8h1;
import p.mir0;
import p.nhc;
import p.opl0;
import p.p6r0;
import p.qir0;
import p.sh41;
import p.t3b1;
import p.w7h1;
import p.wh41;
import p.x6h1;
import p.x7h1;
import p.xj61;
import p.yon1;
import p.z7h1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public class ScannablesOnboardingActivity extends t3b1 {
    public static final /* synthetic */ int g1 = 0;
    public wh41 f1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.o(yon1.T4(), (qir0) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(int i) {
        sh41 sh41Var = (sh41) this.f1.e;
        b7x b7xVar = b7x.a;
        if (i == -1) {
            i8h1 i8h1Var = sh41Var.a;
            opl0 opl0Var = sh41Var.b;
            x6h1 x6h1VarC = opl0Var.c.c();
            x6h1VarC.i.add(new a7h1("information_dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("scan_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "scanning view")), x6h1VarC2.a(), opl0Var.b, System.currentTimeMillis()), (xj61) null);
        } else {
            i8h1 i8h1Var2 = sh41Var.a;
            opl0 opl0Var2 = sh41Var.b;
            x6h1 x6h1VarC3 = opl0Var2.c.c();
            x6h1VarC3.i.add(new a7h1("information_dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
            x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), opl0Var2.b, System.currentTimeMillis()), (xj61) null);
        }
        setResult(i);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super/*p.dac0*/.onActivityResult(i, i2, intent);
        wh41 wh41Var = this.f1;
        sh41 sh41Var = (sh41) wh41Var.e;
        if (i == 4660) {
            ((bx4) wh41Var.d).getClass();
            dx4 parcelableExtra = intent.getParcelableExtra("permission_result");
            int iP0 = f46.p0(parcelableExtra.a, "android.permission.CAMERA");
            b7x b7xVar = b7x.a;
            if (iP0 != -1 && parcelableExtra.b[iP0] == 0) {
                i8h1 i8h1Var = sh41Var.a;
                opl0 opl0Var = sh41Var.b;
                x6h1 x6h1VarC = opl0Var.c.c();
                x6h1VarC.i.add(new a7h1("camera_permission_request_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("allow_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), opl0Var.b, System.currentTimeMillis()), (xj61) null);
                ((ScannablesOnboardingActivity) wh41Var.c).o0(-1);
                return;
            }
            if (wh41Var.b) {
                wh41Var.e(this);
                return;
            }
            i8h1 i8h1Var2 = sh41Var.a;
            opl0 opl0Var2 = sh41Var.b;
            x6h1 x6h1VarC3 = opl0Var2.c.c();
            x6h1VarC3.i.add(new a7h1("camera_permission_request_dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
            x6h1VarC4.i.add(new a7h1("disallow_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), opl0Var2.b, System.currentTimeMillis()), (xj61) null);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624014);
        this.f1.c = this;
        final byte b = 0;
        ((Button) findViewById(2131427809)).setOnClickListener(new View.OnClickListener(this) { // from class: p.uh41
            public final /* synthetic */ ScannablesOnboardingActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, com.spotify.scannables.scannables.view.ScannablesOnboardingActivity] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ?? r0 = this.b;
                switch (b2) {
                    case 0:
                        int i = ScannablesOnboardingActivity.g1;
                        ((ScannablesOnboardingActivity) r0.f1.c).o0(0);
                        break;
                    default:
                        int i2 = ScannablesOnboardingActivity.g1;
                        r0.f1.e(r0);
                        break;
                }
            }
        });
        final byte b2 = 1;
        ((Button) findViewById(2131427824)).setOnClickListener(new View.OnClickListener(this) { // from class: p.uh41
            public final /* synthetic */ ScannablesOnboardingActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, com.spotify.scannables.scannables.view.ScannablesOnboardingActivity] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                ?? r0 = this.b;
                switch (b3) {
                    case 0:
                        int i = ScannablesOnboardingActivity.g1;
                        ((ScannablesOnboardingActivity) r0.f1.c).o0(0);
                        break;
                    default:
                        int i2 = ScannablesOnboardingActivity.g1;
                        r0.f1.e(r0);
                        break;
                }
            }
        });
    }

    public final void onStop() {
        super/*p.dac0*/.onStop();
        this.f1.getClass();
    }
}
