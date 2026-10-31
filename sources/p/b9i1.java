package p;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b9i1 implements acr0 {
    public final kly0 a;
    public final boolean b;
    public final kly0 c;
    public final Set d = Collections.singleton(blc0.i8);

    public b9i1(jly0 jly0Var, boolean z, kly0 kly0Var) {
        this.a = jly0Var;
        this.b = z;
        this.c = kly0Var;
    }

    public final Set a() {
        return this.d;
    }

    public final Class b() {
        return y8i1.class;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x012a  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0143  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        eaa0 eaa0Var;
        px10 px10Var;
        eaa0 eaa0Var2;
        c490 c490Var;
        Bundle extras;
        String string;
        Bundle extras2;
        e490 e490Var;
        String str;
        String string2;
        Object next;
        Bundle extras3;
        Parcelable parcelable;
        String string3;
        Object next2;
        boolean z = th61Var.b;
        Bundle extras4 = intent.getExtras();
        if (extras4 != null) {
            eaa0Var = (eaa0) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras4.getParcelable("jiraConfig", eaa0.class) : extras4.getParcelable("jiraConfig"));
        } else {
            eaa0Var = null;
        }
        Bundle extras5 = intent.getExtras();
        px10 px10Var2 = px10.a;
        px10 px10Var3 = px10.c;
        if (extras5 != null && (string3 = extras5.getString("feedbackReportMode")) != null) {
            Iterator it = px10.e.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!u890.j(((px10) next2).name(), string3));
            px10Var = (px10) next2;
            if (px10Var == null) {
                if (eaa0Var != null) {
                    px10Var = px10Var3;
                } else {
                    px10Var = px10Var2;
                }
            }
        } else if (eaa0Var != null) {
            px10Var = px10Var3;
        } else {
            px10Var = px10Var2;
        }
        boolean z2 = this.b;
        boolean z3 = z2 || (((d35) this.a.get()).a() && z);
        int iOrdinal = px10Var.ordinal();
        px10 px10Var4 = px10.b;
        if (iOrdinal == 0) {
            px10Var3 = px10Var2;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            if (eaa0Var == null) {
                px10Var3 = px10Var2;
            }
        } else if (z3) {
            px10Var3 = px10Var4;
        } else {
            px10Var3 = px10Var2;
        }
        if (z2 || px10Var3 != px10Var4) {
            if (px10Var == px10Var4 && px10Var3 == px10Var2) {
                eaa0Var2 = null;
            }
            if (px10Var3 == px10Var4) {
                extras3 = intent.getExtras();
                if (extras3 == null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) extras3.getParcelable("internalReportContext", c490.class);
                    } else {
                        parcelable = extras3.getParcelable("internalReportContext");
                    }
                    c490Var = (c490) parcelable;
                    if (c490Var == null) {
                        if (z2) {
                            c490Var = ((d490) this.c.get()).a();
                        } else {
                            c490Var = new c490();
                        }
                    }
                } else if (z2) {
                    c490Var = ((d490) this.c.get()).a();
                } else {
                    c490Var = new c490();
                }
            } else {
                c490Var = new c490();
            }
            c490 c490Var2 = c490Var;
            extras = intent.getExtras();
            if (extras != null) {
                string = extras.getString("screenshotFilePath");
            } else {
                string = null;
            }
            extras2 = intent.getExtras();
            if (extras2 == null && (string2 = extras2.getString("internalReportLaunchSource")) != null) {
                Iterator it2 = e490.d.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!u890.j(((e490) next).name(), string2));
                e490Var = (e490) next;
                if (e490Var == null) {
                    if (z2) {
                        e490Var = e490.a;
                    } else {
                        e490Var = e490.b;
                    }
                }
            } else if (z2) {
                e490Var = e490.a;
            } else {
                e490Var = e490.b;
            }
            e490 e490Var2 = e490Var;
            String str2 = th61Var.a;
            if (z || ihc1.y0(str2) || (eaa0Var2 == null && !(z2 && px10Var3 == px10Var4))) {
                str = null;
            } else {
                str = str2;
            }
            return new a9i1(string, eaa0Var2, px10Var3, e490Var2, c490Var2, str);
        }
        eaa0Var = new eaa0(null, null, 127);
        eaa0Var2 = eaa0Var;
        if (px10Var3 == px10Var4) {
            extras3 = intent.getExtras();
            if (extras3 == null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras3.getParcelable("internalReportContext", c490.class);
                } else {
                    parcelable = extras3.getParcelable("internalReportContext");
                }
                c490Var = (c490) parcelable;
                if (c490Var == null) {
                    if (z2) {
                        c490Var = ((d490) this.c.get()).a();
                    } else {
                        c490Var = new c490();
                    }
                }
            } else if (z2) {
                c490Var = ((d490) this.c.get()).a();
            } else {
                c490Var = new c490();
            }
        } else {
            c490Var = new c490();
        }
        c490 c490Var3 = c490Var;
        extras = intent.getExtras();
        if (extras != null) {
            string = extras.getString("screenshotFilePath");
        } else {
            string = null;
        }
        extras2 = intent.getExtras();
        if (extras2 == null) {
            if (z2) {
                e490Var = e490.a;
            } else {
                e490Var = e490.b;
            }
        } else if (z2) {
            e490Var = e490.a;
        } else {
            e490Var = e490.b;
        }
        e490 e490Var3 = e490Var;
        String str3 = th61Var.a;
        if (z) {
            str = null;
        } else {
            str = null;
        }
        return new a9i1(string, eaa0Var2, px10Var3, e490Var3, c490Var3, str);
    }

    public final String getDescription() {
        return "The start of the user feedback journey";
    }

    public final boolean isEnabled() {
        if (this.b) {
            return true;
        }
        kly0 kly0Var = this.a;
        return ((d35) kly0Var.get()).c() || ((d35) kly0Var.get()).a();
    }
}
