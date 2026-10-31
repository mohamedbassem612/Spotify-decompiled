package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import app.p000rive.semantics.SemanticState;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d1d1 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public d1d1(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        c1d1 c1d1Var = new c1d1(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    jah.g("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                jah.g("Unexpected end of document");
                return;
            }
            Menu menu2 = c1d1Var.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, moz0.p);
                        c1d1Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        c1d1Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c1d1Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c1d1Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c1d1Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        c1d1Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        lvc1 lvc1VarD = lvc1.D(context, attributeSet, moz0.q);
                        TypedArray typedArray = (TypedArray) lvc1VarD.c;
                        c1d1Var.i = typedArray.getResourceId(2, 0);
                        c1d1Var.j = (typedArray.getInt(6, c1d1Var.d) & 65535) | (typedArray.getInt(5, c1d1Var.c) & (-65536));
                        c1d1Var.k = typedArray.getText(7);
                        c1d1Var.l = typedArray.getText(8);
                        c1d1Var.m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        c1d1Var.n = string == null ? (char) 0 : string.charAt(0);
                        c1d1Var.o = typedArray.getInt(16, SemanticState.Obscured);
                        String string2 = typedArray.getString(10);
                        c1d1Var.f21p = string2 == null ? (char) 0 : string2.charAt(0);
                        c1d1Var.q = typedArray.getInt(20, SemanticState.Obscured);
                        if (typedArray.hasValue(11)) {
                            c1d1Var.r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c1d1Var.r = c1d1Var.e;
                        }
                        c1d1Var.s = typedArray.getBoolean(3, false);
                        c1d1Var.t = typedArray.getBoolean(4, c1d1Var.f);
                        c1d1Var.u = typedArray.getBoolean(1, c1d1Var.g);
                        c1d1Var.v = typedArray.getInt(21, -1);
                        c1d1Var.y = typedArray.getString(12);
                        c1d1Var.w = typedArray.getResourceId(13, 0);
                        c1d1Var.x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        if (string3 != null && c1d1Var.w == 0 && c1d1Var.x == null) {
                            c1d1Var.z = (z60) c1d1Var.a(string3, f, this.b);
                        } else {
                            c1d1Var.z = null;
                        }
                        c1d1Var.A = typedArray.getText(17);
                        c1d1Var.B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            c1d1Var.D = a8v.c(typedArray.getInt(19, -1), c1d1Var.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            c1d1Var.D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            c1d1Var.C = lvc1VarD.g(18);
                        } else {
                            c1d1Var.C = colorStateList;
                        }
                        lvc1VarD.I();
                        c1d1Var.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        c1d1Var.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(c1d1Var.b, c1d1Var.i, c1d1Var.j, c1d1Var.k);
                        c1d1Var.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        c1d1Var.b = 0;
                        c1d1Var.c = 0;
                        c1d1Var.d = 0;
                        c1d1Var.e = 0;
                        c1d1Var.f = true;
                        c1d1Var.g = true;
                    } else if (name3.equals("item")) {
                        if (!c1d1Var.h) {
                            z60 z60Var = c1d1Var.z;
                            if (z60Var == null || !z60Var.a()) {
                                c1d1Var.h = true;
                                c1d1Var.b(menu2.add(c1d1Var.b, c1d1Var.i, c1d1Var.j, c1d1Var.k));
                            } else {
                                c1d1Var.h = true;
                                c1d1Var.b(menu2.addSubMenu(c1d1Var.b, c1d1Var.i, c1d1Var.j, c1d1Var.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof msi0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof msi0) {
                    msi0 msi0Var = (msi0) menu;
                    if (!msi0Var.f94p) {
                        msi0Var.A();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((msi0) menu).z();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((msi0) menu).z();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
