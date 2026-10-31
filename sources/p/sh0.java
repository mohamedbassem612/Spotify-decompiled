package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class sh0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean c(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        oh0 oh0Var = (oh0) this.e.get(str);
        if ((oh0Var != null ? oh0Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                oh0Var.a.a(oh0Var.b.D(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ah0(intent, i2));
        return true;
    }

    public abstract void d(int i, o1p1 o1p1Var, Object obj);

    public final void e(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        Bundle bundle3 = this.g;
        if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            LinkedHashMap linkedHashMap = this.b;
            boolean zContainsKey = linkedHashMap.containsKey(str);
            LinkedHashMap linkedHashMap2 = this.a;
            if (zContainsKey) {
                Integer num = (Integer) linkedHashMap.remove(str);
                if (!bundle3.containsKey(str)) {
                    w0h1.k(linkedHashMap2).remove(num);
                }
            }
            int iIntValue = integerArrayList.get(i).intValue();
            String str2 = stringArrayList.get(i);
            linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
            linkedHashMap.put(str2, Integer.valueOf(iIntValue));
        }
    }

    public final void f(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.g));
    }

    public final qh0 g(final String str, iac0 iac0Var, final o1p1 o1p1Var, final bh0 bh0Var) {
        x8c0 lifecycle = iac0Var.getLifecycle();
        if (lifecycle.b().a(w8c0.d)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(iac0Var);
            w8c0 w8c0VarB = lifecycle.b();
            sb.append(" is attempting to register while current state is ");
            sb.append(w8c0VarB);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        i(str);
        LinkedHashMap linkedHashMap = this.c;
        ph0 ph0Var = (ph0) linkedHashMap.get(str);
        if (ph0Var == null) {
            ph0Var = new ph0(lifecycle);
        }
        aac0 aac0Var = new aac0() { // from class: p.nh0
            public final void q(iac0 iac0Var2, k8c0 k8c0Var) {
                sh0 sh0Var = this.a;
                LinkedHashMap linkedHashMap2 = sh0Var.e;
                k8c0 k8c0Var2 = k8c0.ON_START;
                String str2 = str;
                if (k8c0Var2 != k8c0Var) {
                    if (k8c0.ON_STOP == k8c0Var) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (k8c0.ON_DESTROY == k8c0Var) {
                            sh0Var.j(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = sh0Var.g;
                LinkedHashMap linkedHashMap3 = sh0Var.f;
                bh0 bh0Var2 = bh0Var;
                o1p1 o1p1Var2 = o1p1Var;
                linkedHashMap2.put(str2, new oh0(bh0Var2, o1p1Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bh0Var2.a(obj);
                }
                ah0 ah0Var = (ah0) jhc1.t(bundle, str2, ah0.class);
                if (ah0Var != null) {
                    bundle.remove(str2);
                    bh0Var2.a(o1p1Var2.D(ah0Var.b, ah0Var.a));
                }
            }
        };
        ph0Var.a.a(aac0Var);
        ph0Var.b.add(aac0Var);
        linkedHashMap.put(str, ph0Var);
        return new qh0(this, str, o1p1Var);
    }

    public final rh0 h(String str, o1p1 o1p1Var, bh0 bh0Var) {
        i(str);
        this.e.put(str, new oh0(bh0Var, o1p1Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bh0Var.a(obj);
        }
        Bundle bundle = this.g;
        ah0 ah0Var = (ah0) jhc1.t(bundle, str, ah0.class);
        if (ah0Var != null) {
            bundle.remove(str);
            bh0Var.a(o1p1Var.D(ah0Var.b, ah0Var.a));
        }
        return new rh0(this, str, o1p1Var);
    }

    public final void i(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : z561.b0(df.c)) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        bhn0.t("Sequence contains no element matching the predicate.");
    }

    public final void j(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString((ah0) jhc1.t(bundle, str, ah0.class));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        ph0 ph0Var = (ph0) linkedHashMap2.get(str);
        if (ph0Var != null) {
            ArrayList arrayList = ph0Var.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ph0Var.a.d((aac0) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
