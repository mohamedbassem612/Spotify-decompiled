package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class msi0 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public ksi0 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public ysi0 v;
    public boolean x;
    public boolean l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f94p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public msi0(Context context) {
        boolean zG;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = f8k1.a;
            if (Build.VERSION.SDK_INT >= 28) {
                zG = mmg1.g(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zG = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zG) {
                z = true;
            }
        }
        this.d = z;
    }

    public final void A() {
        if (this.f94p) {
            return;
        }
        this.f94p = true;
        this.q = false;
        this.r = false;
    }

    public final ysi0 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            hhg1.n("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        ysi0 ysi0Var = new ysi0(this, i, i2, i3, i6, charSequence, this.l ? 1 : 0);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((ysi0) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, ysi0Var);
                q(true);
                return ysi0Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, ysi0Var);
        q(true);
        return ysi0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            ysi0 ysi0VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            ysi0VarA.setIcon(resolveInfo.loadIcon(packageManager));
            ysi0VarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = ysi0VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        ysi0 ysi0VarA = a(i, i2, i3, charSequence);
        alc1 alc1Var = new alc1(this.a, this, ysi0VarA);
        ysi0VarA.o = alc1Var;
        alc1Var.setHeaderTitle(ysi0VarA.e);
        return alc1Var;
    }

    public final void b(pti0 pti0Var) {
        c(pti0Var, this.a);
    }

    public final void c(pti0 pti0Var, Context context) {
        this.u.add(new WeakReference(pti0Var));
        pti0Var.c(context, this);
        this.k = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        ysi0 ysi0Var = this.v;
        if (ysi0Var != null) {
            e(ysi0Var);
        }
        this.f.clear();
        q(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        q(false);
    }

    @Override // android.view.Menu
    public final void close() {
        d(true);
    }

    public final void d(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            pti0 pti0Var = (pti0) weakReference.get();
            if (pti0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pti0Var.b(this, z);
            }
        }
        this.s = false;
    }

    public boolean e(ysi0 ysi0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zG = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == ysi0Var) {
            A();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                pti0 pti0Var = (pti0) weakReference.get();
                if (pti0Var != null) {
                    zG = pti0Var.g(ysi0Var);
                    if (zG) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            z();
            if (zG) {
                this.v = null;
            }
        }
        return zG;
    }

    public boolean f(msi0 msi0Var, ysi0 ysi0Var) {
        ksi0 ksi0Var = this.e;
        return ksi0Var != null && ksi0Var.d(msi0Var, ysi0Var);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ysi0 ysi0Var = (ysi0) arrayList.get(i2);
            if (ysi0Var.a == i) {
                return ysi0Var;
            }
            if (ysi0Var.hasSubMenu() && (menuItemFindItem = ysi0Var.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(ysi0 ysi0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zF = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        A();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            pti0 pti0Var = (pti0) weakReference.get();
            if (pti0Var != null) {
                zF = pti0Var.f(ysi0Var);
                if (zF) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        z();
        if (zF) {
            this.v = ysi0Var;
        }
        return zF;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final ysi0 h(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        i(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (ysi0) arrayList.get(0);
        }
        boolean zO = o();
        for (int i2 = 0; i2 < size; i2++) {
            ysi0 ysi0Var = (ysi0) arrayList.get(i2);
            char c = zO ? ysi0Var.j : ysi0Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zO && c == '\b' && i == 67))) {
                return ysi0Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ysi0) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zO = o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ysi0 ysi0Var = (ysi0) arrayList2.get(i2);
                if (ysi0Var.hasSubMenu()) {
                    ysi0Var.o.i(arrayList, i, keyEvent);
                }
                char c = zO ? ysi0Var.j : ysi0Var.h;
                if ((modifiers & 69647) == ((zO ? ysi0Var.k : ysi0Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zO && c == '\b' && i == 67)) && ysi0Var.isEnabled()) {
                        arrayList.add(ysi0Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return h(i, keyEvent) != null;
    }

    public final void j() {
        ArrayList arrayListM = m();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zH = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                pti0 pti0Var = (pti0) weakReference.get();
                if (pti0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zH |= pti0Var.h();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zH) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM.size();
                for (int i = 0; i < size; i++) {
                    ysi0 ysi0Var = (ysi0) arrayListM.get(i);
                    if ((ysi0Var.x & 32) == 32) {
                        arrayList.add(ysi0Var);
                    } else {
                        arrayList2.add(ysi0Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m());
            }
            this.k = false;
        }
    }

    public String k() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList m() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ysi0 ysi0Var = (ysi0) arrayList2.get(i);
            if (ysi0Var.isVisible()) {
                arrayList.add(ysi0Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean n() {
        return this.w;
    }

    public boolean o() {
        return this.c;
    }

    public boolean p() {
        return this.d;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return s(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        ysi0 ysi0VarH = h(i, keyEvent);
        boolean zS = ysi0VarH != null ? s(ysi0VarH, null, i2) : false;
        if ((i2 & 2) != 0) {
            d(true);
        }
        return zS;
    }

    public final void q(boolean z) {
        if (this.f94p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        A();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            pti0 pti0Var = (pti0) weakReference.get();
            if (pti0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pti0Var.e();
            }
        }
        z();
    }

    public final void r(ysi0 ysi0Var) {
        s(ysi0Var, null, 4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((ysi0) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((ysi0) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((ysi0) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        q(true);
    }

    public final boolean s(MenuItem menuItem, pti0 pti0Var, int i) {
        ysi0 ysi0Var = (ysi0) menuItem;
        boolean zI = false;
        if (ysi0Var == null || !ysi0Var.isEnabled()) {
            return false;
        }
        boolean zF = ysi0Var.f();
        z60 z60Var = ysi0Var.A;
        boolean z = z60Var != null && z60Var.a();
        if (ysi0Var.e()) {
            boolean zExpandActionView = ysi0Var.expandActionView() | zF;
            if (zExpandActionView) {
                d(true);
            }
            return zExpandActionView;
        }
        if (!ysi0Var.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                d(true);
            }
            return zF;
        }
        if ((i & 4) == 0) {
            d(false);
        }
        if (!ysi0Var.hasSubMenu()) {
            alc1 alc1Var = new alc1(this.a, this, ysi0Var);
            ysi0Var.o = alc1Var;
            alc1Var.setHeaderTitle(ysi0Var.e);
        }
        alc1 alc1Var2 = ysi0Var.o;
        if (z) {
            z60Var.e(alc1Var2);
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (!copyOnWriteArrayList.isEmpty()) {
            zI = pti0Var != null ? pti0Var.i(alc1Var2) : false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                pti0 pti0Var2 = (pti0) weakReference.get();
                if (pti0Var2 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else if (!zI) {
                    zI = pti0Var2.i(alc1Var2);
                }
            }
        }
        boolean z2 = zF | zI;
        if (!z2) {
            d(true);
        }
        return z2;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ysi0 ysi0Var = (ysi0) arrayList.get(i2);
            if (ysi0Var.b == i) {
                ysi0Var.x = (ysi0Var.x & (-5)) | (z2 ? 4 : 0);
                ysi0Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ysi0 ysi0Var = (ysi0) arrayList.get(i2);
            if (ysi0Var.b == i) {
                ysi0Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ysi0 ysi0Var = (ysi0) arrayList.get(i2);
            if (ysi0Var.b == i) {
                int i3 = ysi0Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                ysi0Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        q(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(pti0 pti0Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            pti0 pti0Var2 = (pti0) weakReference.get();
            if (pti0Var2 == null || pti0Var2 == pti0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void u(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(k());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((alc1) item.getSubMenu()).u(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void v(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((alc1) item.getSubMenu()).v(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(k(), sparseArray);
        }
    }

    public void w(ksi0 ksi0Var) {
        this.e = ksi0Var;
    }

    public final void x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        q(false);
    }

    public final void y(boolean z) {
        this.x = z;
    }

    public final void z() {
        this.f94p = false;
        if (this.q) {
            this.q = false;
            q(this.r);
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public msi0 l() {
        return this;
    }
}
