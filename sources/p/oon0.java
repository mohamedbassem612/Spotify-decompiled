package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oon0 {
    public static final ThreadLocal c = new ThreadLocal();
    public final Context a;
    public final rzn0 b;

    public oon0(Context context, rzn0 rzn0Var) {
        this.a = context;
        this.b = rzn0Var;
    }

    public static dnn0 c(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        apn0 apn0VarN;
        cnn0 cnn0Var = new cnn0();
        int i2 = 0;
        cnn0Var.b = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object objD = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    apn0VarN = qpn1.j("j$".concat(string.substring(4)), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                    apn0VarN = qpn1.j(string, resourcePackageName);
                }
            } else {
                apn0VarN = qpn1.j(string, resourcePackageName);
            }
        } else {
            apn0VarN = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            int i3 = typedValue.resourceId;
            uon0 uon0Var = apn0.c;
            if (apn0VarN == uon0Var) {
                if (i3 != 0) {
                    i2 = i3;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    StringBuilder sb = new StringBuilder("unsupported value '");
                    sb.append((Object) typedValue.string);
                    String strB = apn0VarN.b();
                    sb.append("' for ");
                    sb.append(strB);
                    sb.append(". Must be a reference to a resource.");
                    throw new XmlPullParserException(sb.toString());
                }
                objD = Integer.valueOf(i2);
            } else if (i3 == 0) {
                uon0 uon0Var2 = apn0.o;
                if (apn0VarN == uon0Var2) {
                    objD = typedArray.getString(1);
                } else {
                    int i4 = typedValue.type;
                    uon0 uon0Var3 = apn0.l;
                    uon0 uon0Var4 = apn0.b;
                    uon0 uon0Var5 = apn0.i;
                    if (i4 == 3) {
                        String string2 = typedValue.string.toString();
                        if (apn0VarN == null) {
                            try {
                                try {
                                    try {
                                        try {
                                            uon0Var4.d(string2);
                                            uon0Var2 = uon0Var4;
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        uon0 uon0Var6 = apn0.f;
                                        uon0Var6.d(string2);
                                        uon0Var2 = uon0Var6;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    uon0Var3.d(string2);
                                    uon0Var2 = uon0Var3;
                                }
                            } catch (IllegalArgumentException unused4) {
                                uon0Var5.d(string2);
                                uon0Var2 = uon0Var5;
                            }
                            apn0VarN = uon0Var2;
                        }
                        objD = apn0VarN.d(string2);
                    } else if (i4 == 4) {
                        apn0VarN = cpn1.n(typedValue, apn0VarN, uon0Var5, string, "float");
                        objD = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        apn0VarN = cpn1.n(typedValue, apn0VarN, uon0Var4, string, "dimension");
                        objD = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        apn0VarN = cpn1.n(typedValue, apn0VarN, uon0Var3, string, "boolean");
                        objD = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (apn0VarN == uon0Var5) {
                            apn0VarN = cpn1.n(typedValue, apn0VarN, uon0Var5, string, "float");
                            objD = Float.valueOf(typedValue.data);
                        } else {
                            apn0VarN = cpn1.n(typedValue, apn0VarN, uon0Var4, string, "integer");
                            objD = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            } else {
                if (apn0VarN != null) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String strB2 = apn0VarN.b();
                    sb2.append("' for ");
                    sb2.append(strB2);
                    sb2.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
                objD = Integer.valueOf(i3);
                apn0VarN = uon0Var;
            }
        }
        if (objD != null) {
            cnn0Var.c = objD;
            cnn0Var.d = true;
        }
        if (apn0VarN != null) {
            cnn0Var.a = apn0VarN;
        }
        return cnn0Var.a();
    }

    public final vnn0 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        String strW;
        Context context;
        int i2;
        Object obj;
        int i3 = i;
        vnn0 vnn0VarA = this.b.b(xmlResourceParser.getName()).a();
        Context context2 = this.a;
        vnn0VarA.k(context2, attributeSet);
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name);
                int[] iArr = dmz0.b;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    vnn0VarA.g.put(string, c(typedArrayObtainAttributes, resources, i3));
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, dmz0.c);
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(i4);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    String strW2 = string2 != null ? nhc1.W(string2, "${applicationId}", context2.getPackageName()) : null;
                    if (string3 == null || string3.length() == 0) {
                        strW = null;
                    } else {
                        strW = nhc1.W(string3, "${applicationId}", context2.getPackageName());
                        if (strW.length() <= 0) {
                            hhg1.n("The NavDeepLink cannot have an empty action.");
                            return null;
                        }
                    }
                    vnn0VarA.b(new snn0(strW2, strW, string4 != null ? nhc1.W(string4, "${applicationId}", context2.getPackageName()) : null));
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if ("action".equals(name)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, dmz0.a, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        int i5 = i4;
                        bnn0 bnn0Var = new bnn0(typedArrayObtainStyledAttributes.getResourceId(i4, 0));
                        bnn0Var.b = new qon0(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            context = context2;
                            if (next2 == i5) {
                                i2 = depth2;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            i2 = depth2;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    String string5 = typedArrayObtainAttributes3.getString(0);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    dnn0 dnn0VarC = c(typedArrayObtainAttributes3, resources, i3);
                                    boolean z = dnn0VarC.c;
                                    if (z && z && (obj = dnn0VarC.e) != null) {
                                        dnn0VarC.a.e(bundle, string5, obj);
                                    }
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i3 = i;
                            }
                            context2 = context;
                            depth2 = i2;
                            i5 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            bnn0Var.c = bundle;
                        }
                        vnn0VarA.l(resourceId, bnn0Var);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        i2 = depth2;
                        if ("include".equals(name) && (vnn0VarA instanceof don0)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, cmz0.c);
                            ((don0) vnn0VarA).n(b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            typedArrayObtainAttributes4.recycle();
                        } else if (vnn0VarA instanceof don0) {
                            ((don0) vnn0VarA).n(a(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i3 = i;
                    context2 = context;
                    depth2 = i2;
                    i4 = 1;
                }
            }
        }
        return vnn0VarA;
    }

    public final don0 b(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        vnn0 vnn0VarA = a(resources, xml, attributeSetAsAttributeSet, i);
        if (vnn0VarA instanceof don0) {
            don0 don0Var = (don0) vnn0VarA;
            xml.close();
            return don0Var;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
