package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class io60 {
    public final ewn0 a;
    public final Activity b;
    public final String c;

    public io60(ewn0 ewn0Var, Activity activity, String str) {
        this.a = ewn0Var;
        this.b = activity;
        this.c = str;
    }

    public static boolean c(Intent intent) {
        Uri data = intent.getData();
        return u890.j(data != null ? data.toString() : null, "spotify:home");
    }

    public static boolean d(Intent intent) {
        return u890.j(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER");
    }

    public final Intent a() {
        Intent intent = new Intent();
        intent.setData(Uri.parse("spotify:home"));
        intent.putExtra("extra_internal_injected", true);
        intent.setAction("android.intent.action.VIEW").setComponent(new ComponentName(this.b.getBaseContext(), this.c));
        intent.setFlags(67108864);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[EDGE_INSN: B:46:0x00bf->B:56:0x00f6 BREAK  A[LOOP:6: B:41:0x00ac->B:98:?]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00bf A[SYNTHETIC] */
    public final ArrayList b(ArrayList arrayList) {
        Iterator it;
        ft30 ft30Var;
        Intent intentA;
        ArrayList arrayList2;
        Iterator it2;
        Intent intent;
        ArrayList<Intent> arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        if (!this.a.i()) {
            r7h.a0(arrayList3, new ft30(this, (byte) 6));
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (!c((Intent) it3.next())) {
                        r7h.a0(arrayList3, new ft30(this, (byte) 7));
                        break;
                    }
                }
            }
        } else {
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    if (d((Intent) it4.next())) {
                        if (arrayList3.isEmpty()) {
                            ft30Var = new ft30(this, (byte) 5);
                            intentA = a();
                            arrayList2 = new ArrayList();
                            it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                intent = (Intent) it2.next();
                                if (((Boolean) ft30Var.invoke(intent)).booleanValue()) {
                                    it2.remove();
                                    intentA.putExtras(intent);
                                    arrayList2.add(intentA);
                                }
                            }
                            arrayList3.addAll(arrayList2);
                            break;
                        }
                        Iterator it5 = arrayList3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                ft30Var = new ft30(this, (byte) 5);
                                intentA = a();
                                arrayList2 = new ArrayList();
                                it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    intent = (Intent) it2.next();
                                    if (((Boolean) ft30Var.invoke(intent)).booleanValue()) {
                                        it2.remove();
                                        intentA.putExtras(intent);
                                        arrayList2.add(intentA);
                                    }
                                }
                                arrayList3.addAll(arrayList2);
                                break;
                            }
                            if (c((Intent) it5.next())) {
                                break;
                            }
                        }
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    arrayList3.add(a());
                    break;
                }
                it = arrayList3.iterator();
                do {
                    if (it.hasNext()) {
                        arrayList3.add(a());
                        break;
                    }
                } while (!c((Intent) it.next()));
            } else {
                Iterator it6 = arrayList3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(a());
                            break;
                        }
                        it = arrayList3.iterator();
                        do {
                            if (it.hasNext()) {
                                arrayList3.add(a());
                                break;
                            }
                        } while (!c((Intent) it.next()));
                    } else if (d((Intent) it6.next())) {
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                if (c((Intent) it7.next())) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Intent intent2 : arrayList3) {
                        if (c(intent2)) {
                            arrayList4.add(intent2);
                        } else {
                            arrayList5.add(intent2);
                        }
                    }
                    arrayList4.addAll(arrayList5);
                    arrayList3.clear();
                    arrayList3.addAll(arrayList4);
                    break;
                }
            }
        }
        return arrayList3;
    }
}
