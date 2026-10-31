package p;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n2l extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p2l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2l(p2l p2lVar, byte b) {
        super(0);
        this.a = b;
        this.b = p2lVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p2l p2lVar = this.b;
        switch (b) {
            case 0:
                r2l r2lVar = p2lVar.W1;
                if (r2lVar == null) {
                    u890.C("listener");
                    throw null;
                }
                t2l t2lVar = r2lVar.d;
                Activity activity = t2lVar.a;
                Intent intent = new Intent();
                intent.setAction("android.settings.BLUETOOTH_SETTINGS");
                PackageManager packageManager = t2lVar.b;
                if (packageManager.resolveActivity(intent, 0) != null) {
                    activity.startActivity(intent);
                } else {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.SETTINGS");
                    if (packageManager.resolveActivity(intent2, 0) != null) {
                        activity.startActivity(intent2);
                    }
                }
                r2lVar.g.A();
                p2lVar.Z0(false, false);
                return rih1Var;
            default:
                r2l r2lVar2 = p2lVar.W1;
                if (r2lVar2 == null) {
                    u890.C("listener");
                    throw null;
                }
                v1k v1kVar = r2lVar2.g;
                i8h1 i8h1Var = (i8h1) v1kVar.b;
                x6h1 x6h1VarC = ((dsk0) v1kVar.c).b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                p2lVar.Z0(false, false);
                return rih1Var;
        }
    }
}
