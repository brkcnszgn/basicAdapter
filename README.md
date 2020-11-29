# BaseRecyclerView

<div align="center">
	<img src="https://user-images.githubusercontent.com/34453671/100551307-a9c6f580-3290-11eb-96db-ba6d714fe13b.gif">
</div>


## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	 implementation 'com.github.brkcnszgn:basicAdapter:1.0.0'
}
```

## Configuration

This step is optional, but if you want you can configure some BaseAdapter parameters. Place this anywhere in your app:

Context / Recycler row_layout / list

```java
 adapter = BaseAdapter(this, R.layout.row_item_main_layout, adapterList) { v, item, position -> /*HigherOrderFun*/
 
                //layout components
                val layoutRoot = v!!.findViewById(R.id.layoutRoot) as LinearLayout
                val imageView = v!!.findViewById(R.id.imageView) as ImageView
                val txtName = v!!.findViewById(R.id.txtName) as TextView
                val txtSubTitle = v!!.findViewById(R.id.txtSubTitle) as TextView
                
                //Your Logic
                
                
                }
                
                binding.recyclerView.adapter = adapter
```

Adapter help fun:

```java
Fun updateItem()-> PositionChanged
Fun getItems() -> Get All Data
Fun setList() -> set new List
Fun removeAt() -> removetPosition
 


## Usage Basicly

binding.recyclerView.adapter = BaseAdapter(this, R.layout.row_item_main_layout, adapterList) { v, item, position -> /*HigherOrderFun*/
 
                //layout components
                val layoutRoot = v!!.findViewById(R.id.layoutRoot) as LinearLayout
                val imageView = v!!.findViewById(R.id.imageView) as ImageView
                val txtName = v!!.findViewById(R.id.txtName) as TextView
                val txtSubTitle = v!!.findViewById(R.id.txtSubTitle) as TextView
                
                //Your Logic
                
                
                }
                

```

