package p;

import dagger.android.DispatchingAndroidInjector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jgu implements dl4 {
    public final Map a;

    public jgu(gg11 gg11Var) {
        gg11 gg11Var2 = gg11.g;
        if (!gg11Var2.isEmpty()) {
            LinkedHashMap linkedHashMapC0 = d0p1.c0(gg11Var.f);
            linkedHashMapC0.putAll(gg11Var);
            for (Map.Entry entry : gg11Var2.g()) {
                linkedHashMapC0.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            gg11Var = Collections.unmodifiableMap(linkedHashMapC0);
        }
        this.a = gg11Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dagger.android.DispatchingAndroidInjector$InvalidInjectorBindingException */
    @Override // p.dl4
    public final void w(Object obj) throws DispatchingAndroidInjector.InvalidInjectorBindingException {
        String name = obj.getClass().getName();
        Map map = this.a;
        kly0 kly0Var = (kly0) map.get(name);
        if (kly0Var == null) {
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (map.containsKey(superclass.getCanonicalName())) {
                    arrayList.add(superclass.getCanonicalName());
                }
            }
            throw new IllegalArgumentException(arrayList.isEmpty() ? f4i1.f("No injector factory bound for Class<", obj.getClass().getCanonicalName(), ">") : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
        }
        cl4 cl4Var = (cl4) kly0Var.get();
        try {
            cl4Var.a(obj).w(obj);
        } catch (ClassCastException e) {
            throw new DispatchingAndroidInjector.InvalidInjectorBindingException(cl4Var.getClass().getCanonicalName() + " does not implement AndroidInjector.Factory<" + obj.getClass().getCanonicalName() + ">", e);
        }
    }
}
