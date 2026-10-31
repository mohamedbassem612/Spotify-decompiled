package p;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.spotify.esperanto.esperantoimpl.SchedulingTransport;
import com.spotify.trending.v1.TnyLocationSuggestion;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class b0o1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138 A[LOOP:0: B:106:0x0136->B:107:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0189  */
    /* JADX WARN: Code duplicated, block: B:114:0x019f  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01be  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:139:0x021a  */
    /* JADX WARN: Code duplicated, block: B:142:0x022b  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    public static final void a(kjd kjdVar, qim0 qim0Var, int i, int i2, float f, float f2, long j, b0k b0kVar, int i3, int i4) {
        qim0 qim0Var2;
        int i5;
        float f3;
        int i6;
        float f4;
        int i7;
        int i8;
        int i9;
        long j2;
        int i10;
        int i11;
        boolean z;
        int i12;
        int i13;
        qim0 qim0Var3;
        long j3;
        float f5;
        float f6;
        h311 h311VarV;
        int i14;
        int i15;
        float f7;
        boolean z2;
        boolean z3;
        boolean z4;
        float fO;
        int i16;
        mmr0[] mmr0VarArr;
        int i17;
        int i18;
        long j4;
        Object obj;
        mmr0[] mmr0VarArr2;
        Object objT;
        ven0 ven0Var;
        Object objT2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean zI;
        Object objT3;
        int i19;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1381350756);
        int i20 = (x340Var.g(kjdVar) ? 4 : 2) | i3;
        int i21 = i4 & 2;
        if (i21 != 0) {
            i5 = i20 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i5 = i20 | (x340Var.g(qim0Var2) ? 32 : 16);
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 256 : 128;
        }
        int i23 = i4 & 8;
        if (i23 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= x340Var.e(i2 != 0 ? l1d.C(i2) : -1) ? 2048 : 1024;
        }
        int i24 = i4 & 16;
        if (i24 == 0) {
            if ((i3 & 24576) == 0) {
                f3 = f;
                i5 |= x340Var.d(f3) ? 16384 : 8192;
            }
            i6 = i4 & 32;
            if (i6 != 0) {
                i8 = i5 | 196608;
                f4 = f2;
            } else {
                f4 = f2;
                if (x340Var.d(f4)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i8 = i5 | i7;
            }
            i9 = i4 & 64;
            if (i9 != 0) {
                i11 = i8 | 1572864;
                j2 = j;
            } else {
                j2 = j;
                if (x340Var.f(j2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i11 = i8 | i10;
            }
            if ((i11 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i11 & 1, z)) {
                if (i21 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i22 != 0) {
                    i14 = 2;
                } else {
                    i14 = i;
                }
                if (i23 != 0) {
                    i15 = 1;
                } else {
                    i15 = i2;
                }
                if (i24 != 0) {
                    f3 = 0.0f;
                }
                if (i6 != 0) {
                    f7 = 0.75f;
                } else {
                    f7 = f4;
                }
                if (i9 != 0) {
                    j2 = u7h.b;
                }
                if ((3670016 & i11) == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((458752 & i11) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                Object objT4 = x340Var.T();
                if (!z4 || objT4 == m4cVar) {
                    fO = Math.abs(f7) <= Float.MAX_VALUE ? yoi1.o(f7, 0.0f, 1.0f) : 0.0f;
                    mmr0VarArr = new mmr0[17];
                    i17 = 0;
                    for (i16 = 17; i17 < i16; i16 = 17) {
                        float f8 = i17 / 16.0f;
                        long j5 = j2;
                        mmr0VarArr[i17] = new mmr0(Float.valueOf(f8), new u7h(u7h.b(j5, klv.c.a(f8) * fO, 0.0f, 0.0f, 0.0f, 14)));
                        i17++;
                        i14 = i14;
                        j2 = j5;
                    }
                    i18 = i14;
                    j4 = j2;
                    x340Var.s0(mmr0VarArr);
                    obj = mmr0VarArr;
                } else {
                    i18 = i14;
                    j4 = j2;
                    obj = objT4;
                }
                mmr0VarArr2 = (mmr0[]) obj;
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = v8r.q((Object) null);
                    x340Var.s0(objT);
                }
                ven0Var = (ven0) objT;
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new cy7(ven0Var, (byte) 15);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarX = ern1.x(qim0VarD, (iu30) objT2);
                if ((i11 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i11 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z8 = z5 | z6;
                if ((i11 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zI = z8 | z7 | ((i11 & 57344) == 16384) | x340Var.i(mmr0VarArr2);
                objT3 = x340Var.T();
                if (!zI || objT3 == m4cVar) {
                    int i25 = i15;
                    objT3 = new hjd(kjdVar, i18, i25, f3, mmr0VarArr2, ven0Var);
                    i19 = i25;
                    x340Var.s0(objT3);
                } else {
                    i19 = i15;
                }
                t1c.a(exd0.r(qim0VarX, (iu30) objT3), x340Var, 0);
                qim0Var3 = qim0Var2;
                f5 = f7;
                i12 = i18;
                i13 = i19;
                j3 = j4;
            } else {
                x340Var.b0();
                i12 = i;
                i13 = i2;
                qim0Var3 = qim0Var2;
                j3 = j2;
                f5 = f4;
            }
            f6 = f3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ijd(kjdVar, qim0Var3, i12, i13, f6, f5, j3, i3, i4);
            }
        }
        i5 |= 24576;
        f3 = f;
        i6 = i4 & 32;
        if (i6 != 0) {
            i8 = i5 | 196608;
            f4 = f2;
        } else {
            f4 = f2;
            if (x340Var.d(f4)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i8 = i5 | i7;
        }
        i9 = i4 & 64;
        if (i9 != 0) {
            i11 = i8 | 1572864;
            j2 = j;
        } else {
            j2 = j;
            if (x340Var.f(j2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i11 = i8 | i10;
        }
        if ((i11 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i11 & 1, z)) {
            if (i21 != 0) {
                qim0Var2 = nim0.a;
            }
            if (i22 != 0) {
                i14 = 2;
            } else {
                i14 = i;
            }
            if (i23 != 0) {
                i15 = 1;
            } else {
                i15 = i2;
            }
            if (i24 != 0) {
                f3 = 0.0f;
            }
            if (i6 != 0) {
                f7 = 0.75f;
            } else {
                f7 = f4;
            }
            if (i9 != 0) {
                j2 = u7h.b;
            }
            if ((3670016 & i11) == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((458752 & i11) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z2 | z3;
            Object objT5 = x340Var.T();
            if (z4) {
                if (Math.abs(f7) <= Float.MAX_VALUE) {
                }
                mmr0VarArr = new mmr0[17];
                i17 = 0;
                while (i17 < i16) {
                    float f9 = i17 / 16.0f;
                    long j6 = j2;
                    mmr0VarArr[i17] = new mmr0(Float.valueOf(f9), new u7h(u7h.b(j6, klv.c.a(f9) * fO, 0.0f, 0.0f, 0.0f, 14)));
                    i17++;
                    i14 = i14;
                    j2 = j6;
                }
                i18 = i14;
                j4 = j2;
                x340Var.s0(mmr0VarArr);
                obj = mmr0VarArr;
            } else {
                if (Math.abs(f7) <= Float.MAX_VALUE) {
                }
                mmr0VarArr = new mmr0[17];
                i17 = 0;
                while (i17 < i16) {
                    float f10 = i17 / 16.0f;
                    long j7 = j2;
                    mmr0VarArr[i17] = new mmr0(Float.valueOf(f10), new u7h(u7h.b(j7, klv.c.a(f10) * fO, 0.0f, 0.0f, 0.0f, 14)));
                    i17++;
                    i14 = i14;
                    j2 = j7;
                }
                i18 = i14;
                j4 = j2;
                x340Var.s0(mmr0VarArr);
                obj = mmr0VarArr;
            }
            mmr0VarArr2 = (mmr0[]) obj;
            objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0Var = (ven0) objT;
            qim0 qim0VarD2 = u291.d(qim0Var2, 1.0f);
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new cy7(ven0Var, (byte) 15);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX2 = ern1.x(qim0VarD2, (iu30) objT2);
            if ((i11 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i11 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z5 | z6;
            if ((i11 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            zI = z9 | z7 | ((i11 & 57344) == 16384) | x340Var.i(mmr0VarArr2);
            objT3 = x340Var.T();
            if (zI) {
                int i26 = i15;
                objT3 = new hjd(kjdVar, i18, i26, f3, mmr0VarArr2, ven0Var);
                i19 = i26;
                x340Var.s0(objT3);
            } else {
                int i27 = i15;
                objT3 = new hjd(kjdVar, i18, i27, f3, mmr0VarArr2, ven0Var);
                i19 = i27;
                x340Var.s0(objT3);
            }
            t1c.a(exd0.r(qim0VarX2, (iu30) objT3), x340Var, 0);
            qim0Var3 = qim0Var2;
            f5 = f7;
            i12 = i18;
            i13 = i19;
            j3 = j4;
        } else {
            x340Var.b0();
            i12 = i;
            i13 = i2;
            qim0Var3 = qim0Var2;
            j3 = j2;
            f5 = f4;
        }
        f6 = f3;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ijd(kjdVar, qim0Var3, i12, i13, f6, f5, j3, i3, i4);
        }
    }

    public static String b() {
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (ihc1.h0(stackTraceElement.getClassName(), "ravelin", false)) {
                arrayList2.add(stackTraceElement);
            }
        }
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add((StackTraceElement) obj);
        }
        return o7h.y0(arrayList, "\n at ", "\n at ", (String) null, new o5n1((byte) 6), 28);
    }

    public static final mir0 c(war0 war0Var, Observable observable) {
        return new mir0(observable.switchMap(new uip0(new en70(war0Var), (byte) 7)));
    }

    public static final be d(SchedulingTransport schedulingTransport) {
        return new be(schedulingTransport);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:0x002e  */
    public static int e(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 6;
        if (i2 < 34) {
            switch (i) {
                case 21:
                case 23:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (i2 >= 30) {
            i3 = i;
        } else if (i == 12) {
            i3 = 1;
        } else if (i != 13) {
            if (i == 16) {
                i3 = 1;
            } else if (i != 17) {
                i3 = i;
            } else {
                i3 = 0;
            }
        }
        if (i2 >= 27 || !(i3 == 7 || i3 == 8 || i3 == 9)) {
            return i3;
        }
        return -1;
    }

    public static int f(int i) {
        return i & 15;
    }

    public static boolean g(AppCompatEditText appCompatEditText, DragEvent dragEvent) {
        Activity activity;
        rcl dulVar;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && b8k1.g(appCompatEditText) != null) {
            Context context = appCompatEditText.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                appCompatEditText.toString();
                return false;
            }
            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = appCompatEditText.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                appCompatEditText.beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) appCompatEditText.getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        dulVar = new rcl(clipData, 3);
                    } else {
                        dulVar = new dul();
                        ((dul) dulVar).b = clipData;
                        ((dul) dulVar).c = 3;
                    }
                    b8k1.j(appCompatEditText, dulVar.build());
                    return true;
                } finally {
                    appCompatEditText.endBatchEdit();
                }
            }
        }
        return false;
    }

    public static boolean h(AppCompatEditText appCompatEditText, int i) {
        rcl dulVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || b8k1.g(appCompatEditText) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) appCompatEditText.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                dulVar = new rcl(primaryClip, 1);
            } else {
                dulVar = new dul();
                ((dul) dulVar).b = primaryClip;
                ((dul) dulVar).c = 1;
            }
            dulVar.setFlags(i != 16908322 ? 1 : 0);
            b8k1.j(appCompatEditText, dulVar.build());
        }
        return true;
    }

    public static final kjd i(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new kjd();
            x340Var.s0(objT);
        }
        return (kjd) objT;
    }

    public static final Integer j(xkk1 xkk1Var) {
        afx afxVar;
        pp70 pp70Var = xkk1Var.d;
        if (pp70Var != null) {
            afxVar = pp70Var.c;
        } else {
            pp70 pp70Var2 = xkk1Var.a.b;
            afxVar = pp70Var2 != null ? pp70Var2.c : null;
        }
        if (afxVar != null) {
            return Integer.valueOf(z4p1.G(afxVar.a.c));
        }
        return null;
    }

    public static Object k(v4o0 v4o0Var, y0o0 y0o0Var, Context context, oxa0 oxa0Var, onm onmVar, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            oxa0Var = null;
        }
        oxa0 oxa0Var2 = oxa0Var;
        v4o0Var.getClass();
        boolean z2 = Build.VERSION.SDK_INT > 36;
        r0o0 r0o0Var = new r0o0(2131231038, context.getString(z2 ? 2131952962 : 2131952963), p7h.M(new q0o0[]{new q0o0(context.getString(2131952966), context.getString(z2 ? 2131952964 : 2131952965), eox.c), new q0o0(context.getString(2131952968), context.getString(2131952967), knx.c)}), z, y0o0Var, true, oxa0Var2);
        l0o0 l0o0Var = l0o0.a;
        Object objB = v4o0Var.b(new n4o0(l0o0Var, r0o0Var, l0o0Var), onmVar);
        return objB == d9n.a ? objB : rih1.a;
    }

    public static String l(String str) {
        return cy30.o("(?m)^#{1,6}\\s+", cy30.o("\\[(.+?)\\]\\(.+?\\)", cy30.o("`(.+?)`", cy30.o("~~(.+?)~~", cy30.o("(?<!\\w)_(.+?)_(?!\\w)", cy30.o("\\*(.+?)\\*", cy30.o("__(.+?)__", cy30.o("\\*\\*(.+?)\\*\\*", str, "$1"), "$1"), "$1"), "$1"), "$1"), "$1"), "$1"), "");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0018 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x001a  */
    public static final xe10 m(eww0 eww0Var, String str) {
        String str2 = eww0Var != null ? eww0Var.a : str;
        if (eww0Var != null) {
            String str3 = eww0Var.b;
            if (ihc1.y0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                str = str3;
            } else if (eww0Var != null) {
                str = eww0Var.a;
            }
        } else if (eww0Var != null) {
            str = eww0Var.a;
        }
        return new xe10(str2, str, eww0Var != null ? eww0Var.f : null);
    }

    public static final nhe0 n(TnyLocationSuggestion tnyLocationSuggestion) {
        String strQ = tnyLocationSuggestion.q();
        strQ.getClass();
        if (strQ.length() == 0 || nhc1.c0(strQ) != null) {
            strQ = null;
        }
        if (strQ == null) {
            String strO = tnyLocationSuggestion.o();
            strQ = strO.length() != 0 ? strO : null;
        }
        return new nhe0(tnyLocationSuggestion.n(), strQ, Integer.valueOf(tnyLocationSuggestion.p()));
    }

    public static final p6r0 o(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("KID_ACCOUNT_CREATION_PIN", "kid-account-creation/pin", 882, "kid-account-creation");
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("KID_ACCOUNT_TRANSITION_PIN", "kid-account-transition/pin", 896, "kid-account-transition");
        }
        eg.o();
        return null;
    }

    public static final lik1 p(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            return nik1.t3;
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            return nik1.K3;
        }
        eg.o();
        return null;
    }

    public static final qcy0 q(qcy0 qcy0Var, tcy0 tcy0Var, Integer num) {
        qcy0 qcy0Var2 = tcy0Var instanceof qcy0 ? (qcy0) tcy0Var : null;
        if (qcy0Var2 != null) {
            qcy0 qcy0Var3 = (u890.j(qcy0Var2.a, qcy0Var.a) && u890.j(qcy0Var2.c, qcy0Var.c)) ? qcy0Var2 : null;
            if (qcy0Var3 != null) {
                return qcy0.b(qcy0Var3, (String) null, num, false, false, 639);
            }
        }
        return null;
    }
}
