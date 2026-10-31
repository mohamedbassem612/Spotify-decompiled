package p;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v90 {
    public static final v90 l;
    public static final v90 m;
    public static final v90 n;
    public static final v90 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v90 f161p;
    public final int a;
    public final boolean b;
    public final byte c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final trd h;
    public final HashSet i;
    public final HashSet j;
    public final HashSet k;

    static {
        u90 u90Var = new u90();
        u90Var.d = 1;
        u90Var.g = true;
        u90Var.i = false;
        v90 v90Var = new v90(u90Var);
        l = v90Var;
        u90 u90Var2 = new u90();
        u90Var2.d = 2;
        u90Var2.g = true;
        u90Var2.i = true;
        u90Var2.b();
        u90 u90Var3 = new u90();
        u90Var3.k = trd.b;
        u90Var3.d = 2;
        v90 v90Var2 = new v90(u90Var3);
        u90 u90Var4 = new u90(v90Var2);
        trd trdVar = trd.d;
        u90Var4.k = trdVar;
        u90Var4.f = (byte) 2;
        u90Var4.i = true;
        u90Var4.b();
        u90 u90Var5 = new u90(v90Var2);
        u90Var5.k = trdVar;
        u90Var5.f = (byte) 2;
        u90Var5.e = true;
        u90Var5.i = true;
        m = new v90(u90Var5);
        u90 u90Var6 = new u90(v90Var2);
        u90Var6.f = (byte) 1;
        u90Var6.k = trd.e;
        u90Var6.i = true;
        u90Var6.j = true;
        u90Var6.b();
        u90 u90Var7 = new u90(v90Var2);
        u90Var7.d = 4;
        u90Var7.f = (byte) 4;
        u90Var7.e = true;
        u90Var7.k = trd.f;
        u90Var7.i = true;
        u90Var7.j = true;
        u90Var7.b();
        u90 u90Var8 = new u90(v90Var2);
        u90Var8.d = 4;
        u90Var8.e = true;
        u90Var8.i = true;
        u90Var8.j = true;
        u90Var8.b();
        u90 u90Var9 = new u90();
        u90Var9.d = 2;
        u90Var9.f = (byte) 2;
        u90Var9.e = true;
        u90Var9.a(1);
        u90Var9.a(Action.TYPE_MEDIA_PLAYBACK);
        u90Var9.i = true;
        n = new v90(u90Var9);
        u90 u90Var10 = new u90();
        u90Var10.d = 1;
        u90Var10.f = (byte) 1;
        u90Var10.a(1);
        u90Var10.g = true;
        u90Var10.i = true;
        u90Var10.b();
        u90 u90Var11 = new u90();
        u90Var11.d = 2;
        u90Var11.a(1);
        u90Var11.a(Action.TYPE_COMPOSE_MESSAGE);
        u90Var11.a(Action.TYPE_MEDIA_PLAYBACK);
        u90Var11.g = true;
        u90Var11.h = true;
        u90Var11.i = true;
        o = new v90(u90Var11);
        u90 u90Var12 = new u90(v90Var);
        u90Var12.a.add(Integer.valueOf(Action.TYPE_APP_ICON));
        f161p = new v90(u90Var12);
        u90 u90Var13 = new u90();
        u90Var13.d = 1;
        u90Var13.g = true;
        u90Var13.f = (byte) 0;
        u90Var13.i = true;
        u90Var13.a(1);
        new v90(u90Var13);
        u90 u90Var14 = new u90(v90Var);
        u90Var14.a(Action.TYPE_APP_ICON);
        u90Var14.a(Action.TYPE_BACK);
        u90Var14.a(1);
        u90Var14.b();
        u90 u90Var15 = new u90();
        u90Var15.a(1);
        u90Var15.g = true;
        u90Var15.d = 5;
        u90Var15.f = (byte) 0;
        u90Var15.e = true;
        u90Var15.i = true;
        u90Var15.b();
        u90 u90Var16 = new u90(v90Var);
        u90Var16.a(Action.TYPE_APP_ICON);
        u90Var16.a(Action.TYPE_BACK);
        u90Var16.b();
        u90 u90Var17 = new u90();
        u90Var17.d = 1;
        u90Var17.i = true;
        u90Var17.g = true;
        u90Var17.a(1);
        u90Var17.f = (byte) 0;
        u90Var17.b();
        u90 u90Var18 = new u90();
        u90Var18.d = 2;
        u90Var18.f = (byte) 2;
        u90Var18.i = true;
        u90Var18.a(1);
        u90Var18.b();
        u90 u90Var19 = new u90();
        u90Var19.d = 3;
        u90Var19.f = (byte) 2;
        u90Var19.i = true;
        u90Var19.a(1);
        u90Var19.b();
    }

    public v90(u90 u90Var) {
        int i = u90Var.d;
        this.a = i;
        this.b = u90Var.e;
        this.c = u90Var.f;
        this.h = u90Var.k;
        this.d = u90Var.g;
        this.e = u90Var.h;
        this.f = u90Var.i;
        this.g = u90Var.j;
        HashSet hashSet = new HashSet(u90Var.a);
        this.i = hashSet;
        HashSet hashSet2 = new HashSet(u90Var.c);
        this.k = hashSet2;
        HashSet hashSet3 = u90Var.b;
        HashSet hashSet4 = new HashSet(hashSet3);
        hashSet4.retainAll(hashSet);
        if (!hashSet4.isEmpty()) {
            hhg1.n("Disallowed action types cannot also be in the required set");
            throw null;
        }
        if (!hashSet3.isEmpty() && !hashSet2.isEmpty()) {
            hhg1.n("Both disallowed and allowed action type set cannot be defined.");
            throw null;
        }
        this.j = new HashSet(hashSet3);
        if (hashSet.size() <= i) {
            return;
        }
        hhg1.n("Required action types exceeded max allowed actions");
        throw null;
    }

    public final void a(List list) {
        HashSet hashSet = this.i;
        Set hashSet2 = hashSet.isEmpty() ? Collections.EMPTY_SET : new HashSet(hashSet);
        Iterator it = list.iterator();
        int i = this.a;
        boolean z = this.b;
        byte b = this.c;
        int i2 = i;
        int i3 = z ? 1 : 0;
        int i4 = b;
        while (it.hasNext()) {
            Action action = (Action) it.next();
            HashSet hashSet3 = this.j;
            if (!hashSet3.isEmpty() && hashSet3.contains(Integer.valueOf(action.getType()))) {
                n9v.j(Action.typeToString(action.getType()), " is disallowed");
                return;
            }
            HashSet hashSet4 = this.k;
            if (!hashSet4.isEmpty() && !hashSet4.contains(Integer.valueOf(action.getType()))) {
                n9v.j(Action.typeToString(action.getType()), " is not allowed");
                return;
            }
            hashSet2.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i4--;
                if (i4 < 0) {
                    hhg1.n(gvg.e(b, "Action list exceeded max number of ", " actions with custom titles"));
                    return;
                }
                this.h.b(title);
            }
            i2--;
            if (i2 < 0) {
                hhg1.n(gvg.e(i, "Action list exceeded max number of ", " actions"));
                return;
            }
            if ((action.getFlags() & 1) != 0 && (i3 = i3 - 1) < 0) {
                hhg1.n(gvg.e(z ? 1 : 0, "Action list exceeded max number of ", " primary actions"));
                return;
            }
            if (this.d && action.getIcon() == null && !action.isStandard()) {
                hhg1.n("Non-standard actions without an icon are disallowed");
                return;
            }
            boolean z2 = this.e;
            if (z2 && ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard())) {
                hhg1.n("Non-standard actions without a background color are disallowed");
                return;
            }
            if (!z2 && !CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.g && (action.getFlags() & 1) == 0) {
                hhg1.n("Background color can only be set for primary actions");
                return;
            } else if (!this.f && action.getOnClickDelegate() != null && !action.isStandard()) {
                hhg1.n("Setting a click listener for a custom action is disallowed");
                return;
            }
        }
        if (hashSet2.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
            sb.append(",");
        }
        hhg1.n(l1d.p(sb, "Missing required action types: "));
    }
}
