package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rya1 implements Iterable {
    public final /* synthetic */ byte a;
    public final Serializable b;
    public final Object c;

    public rya1(Context context) {
        this.a = (byte) 1;
        this.b = new ArrayList();
        this.c = context;
    }

    public static rya1 d(gj5 gj5Var) {
        return new rya1(gj5Var);
    }

    public void b(ComponentName componentName) {
        Context context = (Context) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        try {
            for (Intent intentO = mno1.o(context, componentName); intentO != null; intentO = mno1.o(context, intentO.getComponent())) {
                arrayList.add(size, intentO);
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void c(gj5 gj5Var) {
        Intent intentP = mno1.p(gj5Var);
        if (intentP == null) {
            intentP = mno1.p(gj5Var);
        }
        if (intentP != null) {
            ComponentName component = intentP.getComponent();
            if (component == null) {
                component = intentP.resolveActivity(((Context) this.c).getPackageManager());
            }
            b(component);
            ((ArrayList) this.b).add(intentP);
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            eg.m("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ((Context) this.c).startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        Serializable serializable = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tya1 tya1Var = (tya1) this.c;
                return tya1Var.c.a(tya1Var, (String) serializable);
            default:
                return ((ArrayList) serializable).iterator();
        }
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                cfa0 cfa0Var = new cfa0(", ");
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                cfa0Var.b(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public rya1(tya1 tya1Var, String str) {
        this.a = (byte) 0;
        this.b = str;
        this.c = tya1Var;
    }
}
