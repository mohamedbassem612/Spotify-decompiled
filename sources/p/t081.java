package p;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t081 {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public mrs0[] i;
    public Set j;
    public rre0 k;
    public boolean l;
    public int m;
    public PersistableBundle n;
    public long o;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new s081(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final ShortcutInfo b() {
        r081.b();
        ShortcutInfo.Builder intents = r081.a(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(xzo1.v(iconCompat, this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.m);
        PersistableBundle persistableBundle = this.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            mrs0[] mrs0VarArr = this.i;
            if (mrs0VarArr != null && mrs0VarArr.length > 0) {
                int length = mrs0VarArr.length;
                Person[] personArr = new Person[length];
                while (i < length) {
                    personArr[i] = this.i[i].h();
                    i++;
                }
                intents.setPersons(personArr);
            }
            rre0 rre0Var = this.k;
            if (rre0Var != null) {
                intents.setLocusId(rre0Var.b());
            }
            intents.setLongLived(this.l);
        } else {
            PersistableBundle persistableBundle2 = this.n;
            if (persistableBundle2 == null) {
                persistableBundle2 = new PersistableBundle();
                this.n = persistableBundle2;
            }
            mrs0[] mrs0VarArr2 = this.i;
            if (mrs0VarArr2 != null && mrs0VarArr2.length > 0) {
                persistableBundle2.putInt("extraPersonCount", mrs0VarArr2.length);
                while (i < this.i.length) {
                    PersistableBundle persistableBundle3 = this.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i2 = i + 1;
                    sb.append(i2);
                    persistableBundle3.putPersistableBundle(sb.toString(), this.i[i].j());
                    i = i2;
                }
            }
            rre0 rre0Var2 = this.k;
            if (rre0Var2 != null) {
                this.n.putString("extraLocusId", rre0Var2.a());
            }
            this.n.putBoolean("extraLongLived", this.l);
            intents.setExtras(this.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            gg.N(intents);
        }
        return intents.build();
    }
}
