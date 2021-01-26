# ARCard
 This is an augamented reality card for android app which show the information related on the card.
 
 # Add Module 
1. Add VuforiaWrapper.aar'
2. Add UnityProject.aar

# Change in setting.gradle 
1. Add VuforiaWrapper in include ':VuforiaWrapper'
2. Add UnityProject in include ':UnityProject'

# Change in build.gradle(module) 
1. Add VuforiaWrapper in implementation project(':VuforiaWrapper')
2. Add UnityProject in implementation project(':UnityProject)
