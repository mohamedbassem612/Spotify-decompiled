package p;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyCycle;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.KeyTimeCycle;
import androidx.constraintlayout.motion.widget.KeyTrigger;
import androidx.constraintlayout.motion.widget.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class epa0 {
    public static final HashMap b;
    public HashMap a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            map.put("KeyPosition", KeyPosition.class.getConstructor(null));
            map.put("KeyCycle", KeyCycle.class.getConstructor(null));
            map.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            map.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public epa0(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        HashMap map2;
        try {
            int eventType = xmlResourceParser.getEventType();
            ooa0 ooa0Var = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map3 = b;
                    if (map3.containsKey(name)) {
                        try {
                            Constructor constructor = (Constructor) map3.get(name);
                            if (constructor == null) {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                            ooa0 ooa0Var2 = (ooa0) constructor.newInstance(null);
                            try {
                                ooa0Var2.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(ooa0Var2);
                            } catch (Exception unused) {
                            }
                            ooa0Var = ooa0Var2;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (ooa0Var != null && (map2 = ooa0Var.e) != null) {
                            mhl.e(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && ooa0Var != null && (map = ooa0Var.e) != null) {
                        mhl.e(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused3) {
        }
    }

    public final void a(a aVar) {
        ArrayList arrayList = aVar.w;
        HashMap map = this.a;
        ArrayList arrayList2 = (ArrayList) map.get(Integer.valueOf(aVar.c));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList<ooa0> arrayList3 = (ArrayList) map.get(-1);
        if (arrayList3 != null) {
            for (ooa0 ooa0Var : arrayList3) {
                String str = aVar.b.getLayoutParams().Y;
                String str2 = ooa0Var.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    arrayList.add(ooa0Var);
                }
            }
        }
    }

    public final void b(ooa0 ooa0Var) {
        HashMap map = this.a;
        if (!map.containsKey(Integer.valueOf(ooa0Var.b))) {
            map.put(Integer.valueOf(ooa0Var.b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(ooa0Var.b));
        if (arrayList != null) {
            arrayList.add(ooa0Var);
        }
    }
}
