package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rhk1 {
    public int a;
    public int e;
    public final epa0 f;
    public final fil g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f127p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: IOException | XmlPullParserException -> 0x00ac, IOException | XmlPullParserException -> 0x00ac, TryCatch #0 {IOException | XmlPullParserException -> 0x00ac, blocks: (B:3:0x0024, B:11:0x0035, B:11:0x0035, B:33:0x00a6, B:33:0x00a6, B:14:0x0041, B:14:0x0041, B:15:0x0049, B:15:0x0049, B:32:0x008f, B:32:0x008f, B:17:0x004d, B:17:0x004d, B:22:0x005e, B:22:0x005e, B:20:0x0056, B:20:0x0056, B:23:0x0066, B:23:0x0066, B:25:0x006c, B:25:0x006c, B:26:0x0070, B:26:0x0070, B:28:0x0078, B:28:0x0078, B:29:0x0080, B:29:0x0080, B:31:0x0088, B:31:0x0088), top: B:37:0x0024 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public rhk1(Context context, XmlResourceParser xmlResourceParser) {
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
                                stackTraceElement.getFileName();
                                stackTraceElement.getLineNumber();
                                stackTraceElement.getMethodName();
                                xmlResourceParser.getLineNumber();
                            } else {
                                this.g = kil.d(context, xmlResourceParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                StackTraceElement stackTraceElement2 = new Throwable().getStackTrace()[1];
                                stackTraceElement2.getFileName();
                                stackTraceElement2.getLineNumber();
                                stackTraceElement2.getMethodName();
                                xmlResourceParser.getLineNumber();
                            } else {
                                this.f = new epa0(context, xmlResourceParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                StackTraceElement stackTraceElement3 = new Throwable().getStackTrace()[1];
                                stackTraceElement3.getFileName();
                                stackTraceElement3.getLineNumber();
                                stackTraceElement3.getMethodName();
                                xmlResourceParser.getLineNumber();
                            } else {
                                d(context, xmlResourceParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                StackTraceElement stackTraceElement4 = new Throwable().getStackTrace()[1];
                                stackTraceElement4.getFileName();
                                stackTraceElement4.getLineNumber();
                                stackTraceElement4.getMethodName();
                                xmlResourceParser.getLineNumber();
                            } else {
                                mhl.e(context, xmlResourceParser, this.g.g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                StackTraceElement stackTraceElement5 = new Throwable().getStackTrace()[1];
                                stackTraceElement5.getFileName();
                                stackTraceElement5.getLineNumber();
                                stackTraceElement5.getMethodName();
                                xmlResourceParser.getLineNumber();
                            } else {
                                mhl.e(context, xmlResourceParser, this.g.g);
                            }
                            break;
                        default:
                            StackTraceElement stackTraceElement6 = new Throwable().getStackTrace()[1];
                            stackTraceElement6.getFileName();
                            stackTraceElement6.getLineNumber();
                            stackTraceElement6.getMethodName();
                            xmlResourceParser.getLineNumber();
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(e821 e821Var, MotionLayout motionLayout, int i, kil kilVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator pmm0Var;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        epa0 epa0Var = this.f;
        int i3 = 0;
        if (i2 != 2) {
            fil filVar = this.g;
            if (i2 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                int i4 = 0;
                while (i4 < constraintSetIds.length) {
                    int i5 = constraintSetIds[i4];
                    if (i5 != i) {
                        kil kilVarC = motionLayout.C(i5);
                        int length = viewArr.length;
                        for (int i6 = i3; i6 < length; i6++) {
                            fil filVarM = kilVarC.m(viewArr[i6].getId());
                            if (filVar != null) {
                                eil eilVar = filVar.h;
                                if (eilVar != null) {
                                    eilVar.e(filVarM);
                                }
                                filVarM.g.putAll(filVar.g);
                            }
                        }
                    }
                    i4++;
                    i3 = 0;
                }
            }
            kil kilVar2 = new kil();
            HashMap map = kilVar2.g;
            map.clear();
            for (Integer num : kilVar.g.keySet()) {
                fil filVar2 = (fil) kilVar.g.get(num);
                if (filVar2 != null) {
                    map.put(num, filVar2.clone());
                }
            }
            for (View view : viewArr) {
                fil filVarM2 = kilVar2.m(view.getId());
                if (filVar != null) {
                    eil eilVar2 = filVar.h;
                    if (eilVar2 != null) {
                        eilVar2.e(filVarM2);
                    }
                    filVarM2.g.putAll(filVar.g);
                }
            }
            motionLayout.N(i, kilVar2);
            motionLayout.N(2131431622, kilVar);
            motionLayout.I(2131431622);
            hnm0 hnm0Var = new hnm0(motionLayout.T0, i);
            for (View view2 : viewArr) {
                int i7 = this.h;
                if (i7 != -1) {
                    hnm0Var.h = Math.max(i7, 8);
                }
                hnm0Var.f64p = this.d;
                int i8 = this.l;
                String str = this.m;
                int i9 = this.n;
                hnm0Var.e = i8;
                hnm0Var.f = str;
                hnm0Var.g = i9;
                int id = view2.getId();
                if (epa0Var != null) {
                    ArrayList arrayList = (ArrayList) epa0Var.a.get(-1);
                    epa0 epa0Var2 = new epa0();
                    epa0Var2.a = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ooa0 ooa0VarClone = ((ooa0) it.next()).clone();
                        ooa0VarClone.b = id;
                        epa0Var2.b(ooa0VarClone);
                    }
                    hnm0Var.k.add(epa0Var2);
                }
            }
            motionLayout.setTransition(hnm0Var);
            qub1 qub1Var = new qub1(this, viewArr, (byte) 14);
            motionLayout.y(1.0f);
            motionLayout.O1 = qub1Var;
            return;
        }
        View view3 = viewArr[0];
        a aVar = new a(view3);
        cnm0 cnm0Var = aVar.f;
        cnm0Var.c = 0.0f;
        cnm0Var.d = 0.0f;
        aVar.H = true;
        cnm0Var.d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        aVar.g.d(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        int visibility = view3.getVisibility();
        omm0 omm0Var = aVar.h;
        omm0Var.c = visibility;
        omm0Var.e = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
        omm0Var.f = view3.getElevation();
        omm0Var.g = view3.getRotation();
        omm0Var.h = view3.getRotationX();
        omm0Var.a = view3.getRotationY();
        omm0Var.i = view3.getScaleX();
        omm0Var.t = view3.getScaleY();
        omm0Var.X = view3.getPivotX();
        omm0Var.Y = view3.getPivotY();
        omm0Var.Z = view3.getTranslationX();
        omm0Var.N0 = view3.getTranslationY();
        omm0Var.O0 = view3.getTranslationZ();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        int visibility2 = view3.getVisibility();
        omm0 omm0Var2 = aVar.i;
        omm0Var2.c = visibility2;
        omm0Var2.e = view3.getVisibility() == 0 ? view3.getAlpha() : 0.0f;
        omm0Var2.f = view3.getElevation();
        omm0Var2.g = view3.getRotation();
        omm0Var2.h = view3.getRotationX();
        omm0Var2.a = view3.getRotationY();
        omm0Var2.i = view3.getScaleX();
        omm0Var2.t = view3.getScaleY();
        omm0Var2.X = view3.getPivotX();
        omm0Var2.Y = view3.getPivotY();
        omm0Var2.Z = view3.getTranslationX();
        omm0Var2.N0 = view3.getTranslationY();
        omm0Var2.O0 = view3.getTranslationZ();
        ArrayList arrayList2 = (ArrayList) epa0Var.a.get(-1);
        if (arrayList2 != null) {
            aVar.w.addAll(arrayList2);
        }
        aVar.g(motionLayout.getWidth(), System.nanoTime(), motionLayout.getHeight());
        int i10 = this.h;
        int i11 = this.i;
        int i12 = this.b;
        Context context = motionLayout.getContext();
        int i13 = this.l;
        if (i13 != -2) {
            if (i13 == -1) {
                pmm0Var = new pmm0(clv.d(this.m), (byte) 2);
            } else if (i13 == 0) {
                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
            } else if (i13 == 1) {
                interpolatorLoadInterpolator = new AccelerateInterpolator();
            } else if (i13 == 2) {
                interpolatorLoadInterpolator = new DecelerateInterpolator();
            } else if (i13 == 4) {
                interpolatorLoadInterpolator = new BounceInterpolator();
            } else if (i13 != 5) {
                interpolatorLoadInterpolator = i13 != 6 ? null : new AnticipateInterpolator();
            } else {
                interpolatorLoadInterpolator = new OvershootInterpolator();
            }
            new qhk1(e821Var, aVar, i10, i11, i12, pmm0Var, this.f127p, this.q);
        }
        interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
        pmm0Var = interpolatorLoadInterpolator;
        new qhk1(e821Var, aVar, i10, i11, i12, pmm0Var, this.f127p, this.q);
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof qhl) && (str = view.getLayoutParams().Y) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), inz0.v);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 8) {
                if (MotionLayout.X1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.f127p = typedArrayObtainStyledAttributes.getResourceId(index, this.f127p);
            } else if (index == 3) {
                this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + bmq0.y(this.o, this.a) + ")";
    }
}
