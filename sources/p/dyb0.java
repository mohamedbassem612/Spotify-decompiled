package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class dyb0 {
    public int a;
    public final Object b;
    public final Object c;

    public dyb0(a aVar) {
        this.a = os00.INVALID_ID;
        this.c = new Rect();
        this.b = aVar;
    }

    public static dyb0 b(a aVar, int i) {
        if (i == 0) {
            return new uqq0(aVar);
        }
        if (i == 1) {
            return new vqq0(aVar);
        }
        hhg1.n("invalid orientation");
        return null;
    }

    public void a(y341 y341Var) {
        qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `device_ids` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `one` TEXT, `two` TEXT, `three` TEXT, `four` TEXT, `five` TEXT, `six` TEXT, `seven` TEXT, `deviceIdProvider` TEXT, `createdAt` INTEGER)");
        qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7310f59c1eeed702d405e9bbcc16dba8')");
    }

    public void c(y341 y341Var) {
        qxy0.s(y341Var, "DROP TABLE IF EXISTS `device_ids`");
    }

    public int d(View view) {
        g611 layoutParams = view.getLayoutParams();
        ((a) this.b).getClass();
        return a.P(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    public int e(View view) {
        g611 layoutParams = view.getLayoutParams();
        return ((a) this.b).O(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    public int f(View view) {
        g611 layoutParams = view.getLayoutParams();
        ((a) this.b).getClass();
        return a.N(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    public int g(View view) {
        g611 layoutParams = view.getLayoutParams();
        ((a) this.b).getClass();
        return a.M(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    public int h() {
        return ((a) this.b).O0;
    }

    public int i() {
        a aVar = (a) this.b;
        return aVar.O0 - aVar.getPaddingRight();
    }

    public int j() {
        return ((a) this.b).getPaddingRight();
    }

    public int k() {
        return ((a) this.b).Z;
    }

    public int l() {
        return ((a) this.b).N0;
    }

    public int m() {
        return ((a) this.b).getPaddingLeft();
    }

    public int n() {
        a aVar = (a) this.b;
        return (aVar.O0 - aVar.getPaddingLeft()) - aVar.getPaddingRight();
    }

    public int o() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return n() - this.a;
    }

    public int p(View view) {
        a aVar = (a) this.b;
        Rect rect = (Rect) this.c;
        aVar.Y(rect, view);
        return rect.right;
    }

    public int q(View view) {
        a aVar = (a) this.b;
        Rect rect = (Rect) this.c;
        aVar.Y(rect, view);
        return rect.left;
    }

    public void r(int i) {
        ((a) this.b).d0(i);
    }

    public void t() {
        this.a = n();
    }

    public void u(y341 y341Var) {
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void w(y341 y341Var) {
        nyo1.j(y341Var);
    }

    public nql x(y341 y341Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new mkd1(1, 1, "id", "INTEGER", (String) null, false));
        linkedHashMap.put("one", new mkd1(0, 1, "one", "TEXT", (String) null, false));
        linkedHashMap.put("two", new mkd1(0, 1, "two", "TEXT", (String) null, false));
        linkedHashMap.put("three", new mkd1(0, 1, "three", "TEXT", (String) null, false));
        linkedHashMap.put("four", new mkd1(0, 1, "four", "TEXT", (String) null, false));
        linkedHashMap.put("five", new mkd1(0, 1, "five", "TEXT", (String) null, false));
        linkedHashMap.put("six", new mkd1(0, 1, "six", "TEXT", (String) null, false));
        linkedHashMap.put("seven", new mkd1(0, 1, "seven", "TEXT", (String) null, false));
        linkedHashMap.put("deviceIdProvider", new mkd1(0, 1, "deviceIdProvider", "TEXT", (String) null, false));
        pkd1 pkd1Var = new pkd1("device_ids", linkedHashMap, xvj1.p(linkedHashMap, "createdAt", new mkd1(0, 1, "createdAt", "INTEGER", (String) null, false)), new LinkedHashSet());
        pkd1 pkd1VarB = syo1.B(y341Var, "device_ids");
        return !pkd1Var.equals(pkd1VarB) ? new nql(false, xvj1.k("device_ids(com.ravelin.core.repository.db.entities.DeviceIds).\n Expected:\n", pkd1Var, "\n Found:\n", pkd1VarB)) : new nql(true, (String) null);
    }

    public dyb0(n8h1 n8h1Var, int i, zu30 zu30Var) {
        this.b = n8h1Var;
        this.a = i;
        this.c = zu30Var;
    }

    public dyb0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public void s() {
    }

    public void v() {
    }
}
